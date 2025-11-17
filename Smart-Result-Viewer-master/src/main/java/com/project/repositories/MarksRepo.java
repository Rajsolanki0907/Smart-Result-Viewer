package com.project.repositories;

import com.project.entites.Marks;
import com.project.entites.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarksRepo extends JpaRepository<Marks, Long> {

    List<Marks> findByStudent(Students students);

}
