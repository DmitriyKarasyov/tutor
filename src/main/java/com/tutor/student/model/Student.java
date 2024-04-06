package com.tutor.student.model;

import com.tutor.parent.model.Parent;
import lombok.Data;

@Data
public class Student {

    private Integer id;
    private String name;
    private String telephoneNumber;
    private Parent parent;
}
