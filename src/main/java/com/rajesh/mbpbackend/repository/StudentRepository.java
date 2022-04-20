package com.rajesh.mbpbackend.repository;

import com.rajesh.mbpbackend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

//    @Query("Select s from Student s where s.fName = :fName")
//    List<Student> findAllByFnameAAA(String fName);
}
