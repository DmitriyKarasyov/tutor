package com.tutor.student.dto;

import com.tutor.meetingPoint.model.MeetingPoint;
import com.tutor.parent.model.Parent;
import lombok.Data;

@Data
public class StudentCreationDto {

    private String name;
    private String telephoneNumber;
    private String subject;
    private Integer grade;
    private MeetingPoint meetingPoint;
    private Double lessonCost;
}
