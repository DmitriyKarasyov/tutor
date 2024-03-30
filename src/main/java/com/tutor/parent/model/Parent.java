package com.tutor.parent.model;

import com.tutor.student.model.Student;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Parent {

    private final Integer id;
    private final String name;
}
