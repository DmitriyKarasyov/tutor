package com.tutor.student.model;

import com.tutor.meetingPoint.model.MeetingPoint;
import com.tutor.parent.model.Parent;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "students", schema = "public")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "telephone_number")
    private String telephoneNumber;
    @Column(name = "subject")
    private String subject;
    @Column(name = "grade")
    private Integer grade;

    private MeetingPoint meetingPoint;
    private Double lessonCost;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "students_parents", schema = "public",
            joinColumns = {@JoinColumn(name = "student_id")}, inverseJoinColumns = {@JoinColumn(name = "parent_id")})
    private List<Parent> parents;
}
