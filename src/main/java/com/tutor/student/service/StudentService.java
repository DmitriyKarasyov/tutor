package com.tutor.student.service;

import com.tutor.student.dto.StudentCreationDto;
import com.tutor.student.dto.StudentDto;

public interface StudentService {

    StudentDto addStudent(StudentCreationDto studentCreationDto);

    StudentDto getStudent(Integer studentId);
}
