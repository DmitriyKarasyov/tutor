package com.tutor.student.dto;

import com.tutor.meetingPoint.model.MeetingPoint;
import com.tutor.parent.dto.ParentDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class StudentDto {

    private Integer id;
    private String name;
    private String telephoneNumber;
    private String subject;
    private Integer grade;
    private MeetingPoint meetingPoint;
    private Double lessonCost;
    private List<ParentDto> parentDtoList;
}
