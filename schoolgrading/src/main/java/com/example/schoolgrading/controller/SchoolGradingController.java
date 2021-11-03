package com.example.schoolgrading.controller;

import com.example.schoolgrading.controller.SchoolProcessor.SchoolProcessor;
import com.example.schoolgrading.controller.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class SchoolGradingController {


    @GetMapping
    public String welcomeHome() {
        return "Welcome to School Grading Controller";
    }

    @RequestMapping(value = "/assess", method = RequestMethod.POST)
    public String assessStudent(@RequestBody Student inputRecords, SchoolProcessor inputProcessor) {
        inputProcessor.processStudentRecords(inputRecords);
        return "assessStudent";
    }

    @RequestMapping(value = "/assess1", method = RequestMethod.POST)
    public String assessStudent(@RequestBody List<Student> inputRecords, SchoolProcessor inputProcessor) {
        inputProcessor.processStudentRecordArray(inputRecords);
        //String jsonStr = new ObjectMapper().writeValueAsString(inputRecords);

        return "assessStudent";
    }


}
