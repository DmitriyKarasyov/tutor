package com.tutor.student.controller;

import com.tutor.student.dto.StudentCreationDto;
import com.tutor.student.dto.StudentDto;
import com.tutor.student.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {

    private final StudentService service;

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public StudentDto addStudent(@RequestBody StudentCreationDto studentCreationDto) {
        log.info("POST new student: {}", studentCreationDto);
        return service.addStudent(studentCreationDto);
    }

    @GetMapping("/{studentId}")
    public StudentDto getStudent(@PathVariable Integer studentId) {
        log.info("GET student with id={}", studentId);
        return service.getStudent(studentId);
    }

    @PatchMapping("/{studentId}")
    public StudentDto updateStudent(@PathVariable Integer studentId, @RequestBody StudentDto studentDto) {
        log.info("PATCH student with id={}, studentDto: {}", studentId, studentDto);
        return service.updateStudent(studentId, studentDto);
    }
}
