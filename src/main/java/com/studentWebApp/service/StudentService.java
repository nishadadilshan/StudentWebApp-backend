package com.studentWebApp.service;

import com.studentWebApp.dto.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {

    public ArrayList<Student> getStudent(){
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Dilshan", "Weerathunga", 12));
        studentList.add(new Student("Tharaki", "Weththewa", 13));


        return  studentList;
    }
}
