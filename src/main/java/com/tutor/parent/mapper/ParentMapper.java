package com.tutor.parent.mapper;

import com.tutor.parent.dto.ParentCreationDto;
import com.tutor.parent.dto.ParentDto;
import com.tutor.parent.model.Parent;
import com.tutor.student.dto.StudentDto;
import com.tutor.student.mapper.StudentMapper;
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

    public static Parent makeParent(ParentCreationDto parentCreationDto, Student student) {
        return Parent.builder()
                .name(parentCreationDto.getName())
                .telephoneNumber(parentCreationDto.getTelephoneNumber())
                .students(new ArrayList<>(List.of(student)))
                .build();
    }

    public static ParentDto makeParentDto(Parent parent) {
        return ParentDto.builder()
                .name(parent.getName())
                .telephoneNumber(parent.getTelephoneNumber())
                .studentDtoList(parent.getStudents().stream()
                                                    .map(StudentMapper :: makeStudentDto)
                                                    .collect(Collectors.toList()))
                .build();
    }
}
