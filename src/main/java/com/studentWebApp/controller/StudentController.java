package com.studentWebApp.controller;

import com.studentWebApp.dto.Student;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

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

            studentList.add(new Student("Dilshan", "Weerathunga", 12));
            studentList.add(new Student("Tharaki", "Weththewa", 13));
//            studentList.add(new Student("Nishada", "Dilshan"));
//            studentList.add(new Student("AND", "Weththewa"));


        return  studentList;
    }


    @GetMapping("/getStudentByName/{studentName}")
    public Map<String, Boolean> getStudentByName(@PathVariable String studentName){
        ArrayList<String> list = new ArrayList<>();
        list.add("Dilshan");
        list.add("Nishada");
        list.add("Tharaki");

        if(list.contains(studentName)){
            return Collections.singletonMap("status" , true);
        }else{
            return Collections.singletonMap("status" , false);
        }

    }

    @GetMapping("/getStudentByNameandAge/{studentName}/{studentAge}")
    public Map<String, Boolean> getStudentByNameandAge(
            @PathVariable String studentName,
            @PathVariable int studentAge){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Nishada", "Weerathunga", 25));
        students.add(new Student("Tharaki", "Dilshara", 25));

        Student X = Student.builder().FirstName("XXX").LastName("YYYY").build();

        students.add(X);

        if(students.contains(studentName)){
            return Collections.singletonMap("status" , true);
        }else{
            return Collections.singletonMap("status" , false);
        }

    }
}
