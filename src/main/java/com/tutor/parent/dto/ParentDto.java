package com.tutor.parent.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ParentDto {

    private Integer id;
    private String name;
    private String telephoneNumber;
    private List<Integer> students;
}
