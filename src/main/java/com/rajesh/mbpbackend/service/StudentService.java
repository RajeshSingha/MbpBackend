package com.rajesh.mbpbackend.service;

import com.rajesh.mbpbackend.dto.StudentDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentService {
    List<StudentDTO> getAllStudents();
    ResponseEntity<?> saveStudent(StudentDTO student);
    StudentDTO getStudentByID(Long id);
    ResponseEntity<?> deleteStudentByID(Long id);
}
