package com.tutor.parent.dto;

import com.tutor.student.dto.StudentDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ParentDto {

    private String name;
    private String telephoneNumber;
    private List<StudentDto> studentDtoList;
}
