package com.rajesh.mbpbackend.controller;


import com.rajesh.mbpbackend.dto.StudentDTO;
import com.rajesh.mbpbackend.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/student/")
public class StudentController {

    @Autowired
    StudentService studentService;

    Logger logger = LoggerFactory.getLogger(StudentController.class);


    @PostMapping("/addStudent")
    public ResponseEntity<?> addStudent(@RequestBody StudentDTO sdto){
        // logger.trace("A TRACE Message");
        // logger.debug("A DEBUG Message");
        // logger.info("An INFO Message");
        // logger.warn("A WARN Message");
        // logger.error("An ERROR Message");
		logger.debug("Stduent adeed successfully");
        return studentService.saveStudent(sdto);
    }

    @GetMapping("/getStudents")
    public List<StudentDTO> getStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/getStudentByID/{id}")
    public StudentDTO getStudentByID(@PathVariable ("id") Long id){
        return studentService.getStudentByID(id);
    }

    @DeleteMapping("/deleteStudentByID/{id}")
    public ResponseEntity<?> deleteStudentByID(@PathVariable ("id") Long id){
        return studentService.deleteStudentByID(id);
    }

}
