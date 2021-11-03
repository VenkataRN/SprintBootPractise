package com.example.schoolgrading.controller.student;

import lombok.Getter;
import lombok.Setter;

public class StudentResults {

    @Getter @Setter
    public String studentName;

    @Getter @Setter
    private Integer grade;

    @Getter @Setter
    private Integer bonusMarks;
}
