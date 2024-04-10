package com.tutor.student.service;

import com.tutor.student.model.Student;
import com.tutor.student.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }
    @Override
    public Student getStudent(Integer studentId) {
        return repository.getReferenceById(studentId);
    }
}
