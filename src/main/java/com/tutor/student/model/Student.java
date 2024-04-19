package com.tutor.student.model;

import com.tutor.meetingPoint.model.MeetingPoint;
import com.tutor.parent.model.Parent;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {

    private Integer id;
    private String name;
    private String telephoneNumber;
    private String subject;
    private Integer grade;
    private MeetingPoint meetingPoint;
    private Double lessonCost;
    private Parent parent;
}
