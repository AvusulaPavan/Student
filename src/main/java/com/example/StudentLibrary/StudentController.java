package com.example.StudentLibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")

public class StudentController {

    @Autowired
    StdentService stdentService;

    // adding student to the data base
    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        return stdentService.addStudent(student);
    }

    // getting student from the data base

    @GetMapping("getStudent")
    public Student getStudent(@RequestParam("id") int id){
        return stdentService.getStudent(id);
    }

    // updating student details

    @PutMapping("/update")
    public String update(@RequestParam("id") int id , @RequestParam("name") String name, @RequestParam("age") int age){
        return stdentService.update(id,name,age);
    }

    //deleting the student fromthe database

    @DeleteMapping("delete")
    public String delete(@PathVariable int id){
        return stdentService.delete(id);
    }
}
