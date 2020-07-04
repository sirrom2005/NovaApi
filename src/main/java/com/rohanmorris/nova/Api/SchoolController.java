package com.rohanmorris.nova.Api;

import java.util.List;

import com.rohanmorris.nova.Model.School;
import com.rohanmorris.nova.Model.Subject;
import com.rohanmorris.nova.Service.SchoolService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RequestMapping("api/v1/schools")
@RestController
public class SchoolController {
    private final SchoolService srv;

    @Autowired
    public SchoolController(SchoolService srv) {
        this.srv = srv;
    }

    @GetMapping()
    public List<School> name() {
        return srv.read();
    }

    @GetMapping("{id}")
    public School name(@PathVariable("id") int id) {
        return srv.findById(id);
    }

    @GetMapping("/subects")
    public List<Subject> getSubect() {
        return srv.getSubjectSp();
    }
}