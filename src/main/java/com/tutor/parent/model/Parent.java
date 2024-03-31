package com.tutor.parent.model;

import com.tutor.student.model.Student;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Parent {

    private Integer id;
    private String name;
    private String telephoneNumber;
    private List<Student> students;
}
