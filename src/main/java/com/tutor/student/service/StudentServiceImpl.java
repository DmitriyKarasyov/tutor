package com.tutor.student.service;

import com.tutor.student.dto.StudentCreationDto;
import com.tutor.student.dto.StudentDto;
import com.tutor.student.mapper.StudentMapper;
import com.tutor.student.model.Student;
import com.tutor.student.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentDto addStudent(StudentCreationDto studentCreationDto) {
        return StudentMapper.makeStudentDto(studentRepository.save(StudentMapper.makeStudent(studentCreationDto)));
    }

    @Override
    public StudentDto getStudent(Integer studentId) {
        return StudentMapper.makeStudentDto(studentRepository.getReferenceById(studentId));
    }
}
