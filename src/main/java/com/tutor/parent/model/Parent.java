package com.tutor.parent.model;

import com.tutor.student.model.Student;
import lombok.Data;

@Data
public class Parent {

    private final Integer id;
    private final Student student;
}
