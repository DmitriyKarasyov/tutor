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

    @Override
    public StudentDto updateStudent(Integer studentId, StudentDto studentDto) {
        Student savedStudent = studentRepository.getReferenceById(studentId);
        if (studentDto.getName() != null && !studentDto.getName().isBlank()) {
            savedStudent.setName(studentDto.getName());
        }
        if (studentDto.getTelephoneNumber() != null && !studentDto.getTelephoneNumber().isBlank()) {
            savedStudent.setTelephoneNumber(studentDto.getTelephoneNumber());
        }
        studentRepository.save(savedStudent);
        return StudentMapper.makeStudentDto(savedStudent);
    }

    @Override
    public void deleteStudent(Integer studentId) {
        studentRepository.deleteById(studentId);
    }
}
