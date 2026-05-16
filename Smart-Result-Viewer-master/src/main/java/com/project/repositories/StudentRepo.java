package com.project.repositories;

import com.project.entites.Marks;
import com.project.entites.Students;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Students, String> {

    Optional<Students> findByRollNumber(String rollNumber);

    Optional<Students> findByRollNumberAndDateOfBirth(String rollNumber, LocalDate dateOfBirth);
}
