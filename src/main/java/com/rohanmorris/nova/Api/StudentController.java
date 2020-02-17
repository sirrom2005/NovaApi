package com.rohanmorris.nova.Api;

import com.rohanmorris.nova.Model.Student;
import com.rohanmorris.nova.Service.StudentService;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") int id) {
        return 0;
    }

    @GetMapping("count")
    public int get() {
        return srv.getCount();
    }
}