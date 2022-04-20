package com.rajesh.mbpbackend.mapper;

import com.rajesh.mbpbackend.dto.StudentDTO;
import com.rajesh.mbpbackend.model.Student;

public class StudentMapper {
    public static Student getStudentFromStudentDTo(StudentDTO studentDTO){
        Student student = new Student();
        student.setFname(studentDTO.getFname());
        student.setId(studentDTO.getId());
        student.setLname(studentDTO.getLname());
        student.setEmail(studentDTO.getEmail());
        return student;
    }

    public static StudentDTO getStudentDTOFromStudent(Student student){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setFname(student.getFname());
        studentDTO.setId(student.getId());
        studentDTO.setLname(student.getLname());
        studentDTO.setEmail(student.getEmail());
        return studentDTO;
    }
}