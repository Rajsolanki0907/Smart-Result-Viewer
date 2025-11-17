package com.project.repositories;

import com.project.entites.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeacherRepo extends JpaRepository<Teacher, String>
{
  Optional<Teacher> findByUsernameAndPassword(String username, String password);
}
