package com.example.schoolgrading.SchoolProcessor;

import com.example.schoolgrading.student.Student;
import com.example.schoolgrading.student.StudentResult;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//@NoArgsConstructor
public interface  SchoolProcessor {
    StudentResult processSingleStudentRecord(Student inputRecords);

    List<StudentResult>   processMultipleStudentRecords(List<Student> inputRecords) ;

    //Learn: Method definitions are not allowed in Interface. But allowed if "default" like below is used
    default Integer dummyFunctionInInterface() { return 0;}
}
