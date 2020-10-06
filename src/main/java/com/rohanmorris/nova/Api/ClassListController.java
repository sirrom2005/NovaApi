package com.rohanmorris.nova.Api;

import com.rohanmorris.nova.Model.ClassList;
import com.rohanmorris.nova.Service.ClassListService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RequestMapping("api/v1/classlist")
@RestController
public class ClassListController {
    private ClassListService srv;

    /**
     * @param srv
     */
    public ClassListController(ClassListService srv) {
        this.srv = srv;
    }

    @GetMapping("{id}")
    public Iterable<ClassList> findById(@PathVariable("id") long id) {
        return srv.findByClassId(id);
    }
}