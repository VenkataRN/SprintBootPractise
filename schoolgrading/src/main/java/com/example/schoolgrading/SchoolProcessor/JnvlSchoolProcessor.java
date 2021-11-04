package com.example.schoolgrading.SchoolProcessor;

import com.example.schoolgrading.student.Student;
import com.example.schoolgrading.student.StudentResult;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JnvlSchoolProcessor implements SchoolProcessor {

    public JnvlSchoolProcessor() {
    }

    @Override
    public StudentResult processSingleStudentRecord(Student inputRecords) {
        return null;
    }

    @Override
    public List<StudentResult> processMultipleStudentRecords(List<Student> inputRecords) {
        return null;
    }

}
