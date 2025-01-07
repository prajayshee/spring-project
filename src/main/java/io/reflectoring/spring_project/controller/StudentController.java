package io.reflectoring.spring_project.controller;

import io.reflectoring.spring_project.entity.*;
import io.reflectoring.spring_project.repository.StudentRepo;
import io.reflectoring.spring_project.repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private SubjectRepo subjectRepo;

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        try {
            // Save the student object
            Student savedStudent = studentRepo.save(student);
            return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace(); 
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentRepo.findAll();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
}
