package com.rohanmorris.nova.Api;

import java.util.List;

import javax.validation.Valid;

import com.rohanmorris.nova.Model.StudentBehavior;
import com.rohanmorris.nova.Service.StudentBehaviorService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RequestMapping("api/v1/studentbehavior")
@RestController
public class StudentBehaviorController{
    private StudentBehaviorService srv;

    public StudentBehaviorController(StudentBehaviorService srv) {
        this.srv = srv;
    }

    @PostMapping()
    public long create(@Valid @RequestBody StudentBehavior data) {
        return srv.create(data);
    }

    @GetMapping("{id}")
    public StudentBehavior name(@PathVariable("id") long id) {
        return srv.findById(id);
    }

    @GetMapping("student/{id}")
    public List<StudentBehavior> student(@PathVariable("id") long id) {
        return srv.findByStudentId(id);
    }
}