package com.tutor.student.mapper;

import com.tutor.parent.mapper.ParentMapper;
import com.tutor.student.dto.StudentCreationDto;
import com.tutor.student.dto.StudentDto;
import com.tutor.student.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentMapper {

    public static Student makeStudent(StudentCreationDto studentCreationDto) {
        return Student.builder()
                .name(studentCreationDto.getName())
                .telephoneNumber(studentCreationDto.getTelephoneNumber())
                .grade(studentCreationDto.getGrade())
                .subject(studentCreationDto.getSubject())
                .lessonCost(studentCreationDto.getLessonCost())
                .meetingPoint(studentCreationDto.getMeetingPoint())
                .build();
    }

    public static StudentDto makeStudentDto(Student student) {
        return StudentDto.builder()
                .id(student.getId())
                .name(student.getName())
                .telephoneNumber(student.getTelephoneNumber())
                .subject(student.getSubject())
                .grade(student.getGrade())
                .lessonCost(student.getLessonCost())
                .meetingPoint(student.getMeetingPoint())
                .parentDto(ParentMapper.makeParentDto(student.getParent()))
                .build();
    }
}
