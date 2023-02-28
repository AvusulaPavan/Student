package com.example.StudentLibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StdentService {
    @Autowired
    StudentRepository studentRepository;

    public String addStudent(Student student) {
        studentRepository.save(student);
        return "Student added successfully";
    }

    public Student getStudent(int id) {
        return studentRepository.findById(id).get();
    }

    public String update(int id, String name, int age) {
        Student student=studentRepository.findById(id).get();
        student.setName(name);
        student.setAge(age);
        studentRepository.save(student);
        return "Student details edited successfully";
    }

    public String delete(int id) {
        studentRepository.deleteById(id);
        return "Student deleted successfully";
    }
}
