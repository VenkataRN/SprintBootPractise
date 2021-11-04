package com.example.schoolgrading.student;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @JsonProperty("schoolname")
    @JsonAlias("school")
    public String schoolName;

//    @Getter @Setter
    @JsonProperty("name")
    public String studentName;

//    @Getter @Setter
    @JsonProperty("grade")
    private Integer grade;

    public Student() {
    }

    public Integer getBonusMarks(){
        return -1;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

}
