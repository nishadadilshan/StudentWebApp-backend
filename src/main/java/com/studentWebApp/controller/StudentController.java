package com.studentWebApp.controller;

import com.studentWebApp.dto.Student;
import com.studentWebApp.service.StudentService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class StudentController {

    //call this type of method as handler methods
    @GetMapping("/getStudent")
    public List<Student> getStudent(){
       StudentService studentService = new StudentService();
        ArrayList<Student> studentList = studentService.getStudent();
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
