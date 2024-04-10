package com.tutor.parent.mapper;

import com.tutor.parent.dto.ParentCreationDto;
import com.tutor.parent.dto.ParentDto;
import com.tutor.parent.model.Parent;
import com.tutor.student.model.Student;
import com.tutor.student.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParentMapper {

    private final StudentService studentService;

    public ParentMapper (StudentService studentService) {
        this.studentService = studentService;
    }

    public Parent makeParent(ParentCreationDto parentCreationDto, Integer studentId) {
        return Parent.builder()
                .name(parentCreationDto.getName())
                .telephoneNumber(parentCreationDto.getTelephoneNumber())
                .students(new ArrayList<>(List.of(studentService.getStudent(studentId))))
                .build();
    }

    public ParentDto makeParentDto(Parent parent) {
        return ParentDto.builder()
                .name(parent.getName())
                .telephoneNumber(parent.getTelephoneNumber())
                .students(parent.getStudents().stream()
                                                    .map(Student :: getId)
                                                    .collect(Collectors.toList()))
                .build();
    }
}
