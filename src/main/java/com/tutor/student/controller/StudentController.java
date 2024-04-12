package com.tutor.student.controller;

import com.tutor.student.dto.StudentCreationDto;
import com.tutor.student.dto.StudentDto;
import com.tutor.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService service;

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public StudentDto addStudent(@RequestBody StudentCreationDto studentCreationDto) {
        return service.addStudent(studentCreationDto);
    }
}
