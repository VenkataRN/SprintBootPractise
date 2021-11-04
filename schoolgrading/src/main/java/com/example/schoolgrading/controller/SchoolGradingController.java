package com.example.schoolgrading.controller;

import com.example.schoolgrading.SchoolProcessor.JnvlSchoolProcessor;
import com.example.schoolgrading.SchoolProcessor.SchoolProcessor;
import com.example.schoolgrading.student.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SchoolGradingController {

    Logger logger = LoggerFactory.getLogger(SchoolGradingController.class);

    public SchoolProcessor schoolProcessor;

    @Autowired
    SchoolGradingController(SchoolProcessor schoolProcessor) { this.schoolProcessor = schoolProcessor;}

    @GetMapping
    public String welcomeHome() {
        logger.info("Logging: Welcome to School Grading Application Controller");
        return "Welcome to School Grading Application";
    }

    /*
    Learn: Here if we observe schoolProcessor object automatically calling JnvlSchoolProcessor->processingSingleStudent function
    even though it is interface, because we autowired in Constructor of this class.
    Spring has knowledge to identify the derived class to create instance to "SchoolProcessor schoolProcessor".
     */
    @RequestMapping(value = "/assess", method = RequestMethod.POST)
    public String assessStudent(@RequestBody Student inputRecord) {
        System.out.println("Hello");
        schoolProcessor.processSingleStudentRecord(inputRecord); //It Calls JnvlSchoolProcessor's function
        return "assessStudent";
    }

    /*
    Learn: Here JnvlSchoolProcessor is created as part of the function argument and we are using the same further.
    Here we are not using the schoolProcessor object which is created using autowired in constructor.
     */
    @RequestMapping(value = "/assess1", method = RequestMethod.POST)
    public String assessStudent(@RequestBody List<Student> inputRecords, JnvlSchoolProcessor inputProcessor) {
       inputProcessor.processMultipleStudentRecords(inputRecords);
        //String jsonStr = new ObjectMapper().writeValueAsString(inputRecords);

        return "assessStudents";
    }


}
