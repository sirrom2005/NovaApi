package com.rohanmorris.nova.Api;

import java.util.Optional;

import javax.validation.Valid;

import com.rohanmorris.nova.Model.Student;
import com.rohanmorris.nova.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RequestMapping("api/v1/students")
@RestController
public class StudentController
{
    private final StudentService srv;

    @Autowired
    public StudentController(StudentService srv) {
        this.srv = srv;
    }

    @PostMapping()
    public Student save(@Valid @RequestBody Student entity) {
        return srv.save(entity);
    }

    @GetMapping("{id}")
    public Optional<Student> findById(@PathVariable("id") long id) {
        return srv.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id") long id) {
        srv.deleteById(id);
    }
}