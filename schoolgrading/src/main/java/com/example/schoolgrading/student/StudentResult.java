package com.example.schoolgrading.student;

import lombok.Getter;
import lombok.Setter;

public class StudentResult {

    @Getter @Setter
    public String studentName;

    @Getter @Setter
    private Integer grade;

    @Getter @Setter
    private Integer bonusMarks;
}
