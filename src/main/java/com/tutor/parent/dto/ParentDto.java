package com.tutor.parent.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ParentDto {
    private final Integer id;
    private final String name;
}
