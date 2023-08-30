package com.studentWebApp.controller;

import com.studentWebApp.entity.Student;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@CrossOrigin
@RestController
public class StudentController {

    @GetMapping("/getStudent")

    public ArrayList<Student> getStudent(){

        ArrayList<Student> studentList = new ArrayList<>();


//        Student student1 = new Student();
//        student1.setFirstName("Dilshan");
//        student1.setLastName("Weerathunga");
//        studentList.add(student1);
//
//        Student student2 = new Student();
//        student2.setFirstName("Tharki");
//        student2.setLastName("Dilshara");
//        studentList.add(student2);

            studentList.add(new Student("Dilshan", "Weerathunga"));
            studentList.add(new Student("Tharaki", "Weththewa"));


        return  studentList;
    }
}
