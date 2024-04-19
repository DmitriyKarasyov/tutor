package com.tutor.meetingPoint.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MeetingPoint {
    private Boolean online;
    private String address;
}
