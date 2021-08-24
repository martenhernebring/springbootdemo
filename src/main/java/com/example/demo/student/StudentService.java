package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "Mårten", "marten.hernebring@gmail.com", LocalDate.of(1986, Month.APRIL, 26), 35)
        );
    }
}
