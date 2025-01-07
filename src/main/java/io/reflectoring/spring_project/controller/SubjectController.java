package io.reflectoring.spring_project.controller;

import io.reflectoring.spring_project.entity.Subject;
import io.reflectoring.spring_project.repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {

    @Autowired
    private SubjectRepo subjectRepo;

    @PostMapping
    public ResponseEntity<Subject> createSubject(@RequestBody Subject subject) {
        try {
            // Save the subject object
            Subject savedSubject = subjectRepo.save(subject);
            return new ResponseEntity<>(savedSubject, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace(); // Log the error
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<List<Subject>> getAllSubjects() {
        List<Subject> subjects = subjectRepo.findAll();
        return new ResponseEntity<>(subjects, HttpStatus.OK);
    }
}
