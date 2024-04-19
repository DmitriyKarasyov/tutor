package com.tutor.parent.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ParentDto {

    private String name;
    private String telephoneNumber;
}
