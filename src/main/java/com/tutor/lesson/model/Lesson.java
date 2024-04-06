package com.tutor.lesson.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Lesson {

    private LocalDateTime start;
    private LocalDateTime end;
}
