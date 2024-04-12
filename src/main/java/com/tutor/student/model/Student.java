package com.tutor.student.model;

import com.tutor.parent.model.Parent;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {

    private Integer id;
    private String name;
    private String telephoneNumber;
    private Parent parent;
}
