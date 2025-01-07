package io.reflectoring.spring_project.repository;

import io.reflectoring.spring_project.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface StudentRepo extends JpaRepository<Student, Long>{
	Student findByEmail(String email);
    
    // Find students by last name
    List<Student> findByLastName(String lastName);
    
    // Custom query: Find students by first name (with a case-insensitive search)
    List<Student> findByFirstNameIgnoreCase(String firstName);
}
