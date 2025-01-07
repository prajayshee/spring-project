package io.reflectoring.spring_project.repository;

import io.reflectoring.spring_project.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface SubjectRepo extends JpaRepository<Subject, Long>{
	List<Subject> findByName(String name);
    
    // Custom query: Find subjects by name (case insensitive)
    List<Subject> findByNameIgnoreCase(String name);
}
