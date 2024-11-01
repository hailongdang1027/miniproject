package com.example.miniproject.config;

import com.example.miniproject.models.Student;
import com.example.miniproject.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository
    ){
        return args -> {
            Student infoLong = new Student(
                    "Long",
                    "hailong2710@gmail.com",
                    LocalDate.of(2000, Month.OCTOBER, 27)
            );

            Student infoCuong = new Student(
                    "Cuong",
                    "cuong@gmail.com",
                    LocalDate.of(2000, Month.MAY, 24)
            );
            Student infoThanhLong = new Student(
                    "ThanhLong",
                    "thanhlong@gmail.com",
                    LocalDate.of(2000, Month.SEPTEMBER, 2)
            );
            studentRepository.saveAll(
                    List.of(infoLong, infoCuong, infoThanhLong)
            );
        };
    }
}
