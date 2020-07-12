package com.rohanmorris.nova.Api;

import javax.validation.Valid;

import com.rohanmorris.nova.Model.ExamGrade;
import com.rohanmorris.nova.Service.ExamGradeService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RequestMapping("api/v1/examgrade")
@RestController
public class ExamGradeController {
    private ExamGradeService srv;

    /**
     * @param srv
     */
    public ExamGradeController(ExamGradeService srv) {
        this.srv = srv;
    }

    @PostMapping()
    public ExamGrade create(@Valid @RequestBody ExamGrade grade) {
        return srv.create(grade);
    }
}