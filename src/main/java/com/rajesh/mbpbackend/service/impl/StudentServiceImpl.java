package com.rajesh.mbpbackend.service.impl;


import com.rajesh.mbpbackend.dto.StudentDTO;
import com.rajesh.mbpbackend.mapper.StudentMapper;
import com.rajesh.mbpbackend.model.Student;
import com.rajesh.mbpbackend.repository.StudentRepository;
import com.rajesh.mbpbackend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<StudentDTO> getAllStudents() {
        return studentRepository.findAll().stream().map(StudentMapper::getStudentDTOFromStudent).collect(Collectors.toList());
    }

    @Override
    public ResponseEntity<?> saveStudent(StudentDTO studentDTO) {
        Student s = StudentMapper.getStudentFromStudentDTo(studentDTO);
        studentRepository.save(s);
        return ResponseEntity.ok("Student saved successfully");
    }

    @Override
    public StudentDTO getStudentByID(Long id) {
        return StudentMapper.getStudentDTOFromStudent(studentRepository.findById(id).orElse(new Student()));
    }

    @Override
    public ResponseEntity<?> deleteStudentByID(Long id) {
        studentRepository.deleteById(id);
        return ResponseEntity.ok("Student id " + id + " deleted successfully");
    }
}
