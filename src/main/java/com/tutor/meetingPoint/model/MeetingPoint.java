package com.tutor.meetingPoint.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "meeting_points", schema = "public")
public class MeetingPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "online_link")
    private String onlineLink;
    @Column(name = "offline_address")
    private String offlineAddress;
}
