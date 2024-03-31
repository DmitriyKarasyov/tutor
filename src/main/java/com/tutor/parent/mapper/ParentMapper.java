package com.tutor.parent.mapper;

import com.tutor.parent.dto.ParentCreationDto;
import com.tutor.parent.dto.ParentDto;
import com.tutor.parent.model.Parent;
import com.tutor.student.model.Student;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class ParentMapper {

    public Parent makeParent(ParentCreationDto parentCreationDto) {
        return Parent.builder()
                .name(parentCreationDto.getName())
                .telephoneNumber(parentCreationDto.getTelephoneNumber())
                .build();
    }

    public ParentDto makeParentDto(Parent parent) {
        return ParentDto.builder()
                .id(parent.getId())
                .name(parent.getName())
                .telephoneNumber(parent.getTelephoneNumber())
                .students(parent.getStudents().stream()
                                                    .map(Student :: getId)
                                                    .collect(Collectors.toList()))
                .build();
    }
}
