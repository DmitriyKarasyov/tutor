package com.tutor.student.service;

import com.tutor.student.dto.StudentCreationDto;
import com.tutor.student.dto.StudentDto;
import com.tutor.student.model.Student;

public interface StudentService {

    StudentDto addStudent(StudentCreationDto studentCreationDto);

    Student getStudent(Integer studentId);
}
