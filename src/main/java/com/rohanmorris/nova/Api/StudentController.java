package com.rohanmorris.nova.Api;

import java.util.HashMap;
import java.util.List;
import javax.validation.Valid;

import com.rohanmorris.nova.Model.FormList;
import com.rohanmorris.nova.Model.Student;
import com.rohanmorris.nova.Model.StudentInfo;
import com.rohanmorris.nova.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RequestMapping("api/v1/students")
@RestController
public class StudentController {

    private final StudentService srv;

    @Autowired
    public StudentController(StudentService srv) {
        this.srv = srv;
    }

    @GetMapping()
    public HashMap<String, List<Student>> read() {
        return srv.read();
    }

    @GetMapping("{id}")
    public StudentInfo findById(@PathVariable("id") int id) {
        return srv.findById(id);
    }

    @PostMapping()
    public int create(@Valid @RequestBody Student student) {
        return srv.create(student);
    }

    @PutMapping("{id}")
    public Student update(@PathVariable("id") int id, @RequestBody Student student) {
        return srv.update(id, student);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable("id") int id) {
        return srv.delete(id);
    }

    @GetMapping("count")
    public int get() {
        return srv.getCount();
    }
}