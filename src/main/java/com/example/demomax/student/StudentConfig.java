package com.example.demomax.student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student maria = new Student(
                    "max",
                    "max@gmail.com",
                    LocalDate.of(2000, JANUARY, 5),
                    21
            );
            Student max = new Student(
                    "maxs",
                    "maxs@gmail.com",
                    LocalDate.of(2000, JANUARY, 5),
                    22
            );
            repository.saveAll(
                    List.of(maria, max)
            );
        };
    }
}
