package com.example.miniproject.repository;

import com.example.miniproject.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("select s from Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
