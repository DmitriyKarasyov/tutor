package com.tutor.student.dto;

import com.tutor.parent.dto.ParentDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentDto {

    private Integer id;
    private String name;
    private String telephoneNumber;
    private ParentDto parentDto;
}
