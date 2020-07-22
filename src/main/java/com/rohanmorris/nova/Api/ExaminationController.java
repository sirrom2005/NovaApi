package com.rohanmorris.nova.Api;

import io.swagger.annotations.Authorization;
import java.util.Optional;
import javax.validation.Valid;

import com.rohanmorris.nova.Model.Examination;
import com.rohanmorris.nova.Service.ExamaminationService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(maxAge = 3600)
@RequestMapping("api/v1/examination")
@RestController
@ApiOperation(value = "", authorizations = { @Authorization(value="jwtToken") })
public class ExaminationController {
    private ExamaminationService srv;

    /**
     * @param srv
     */
    public ExaminationController(ExamaminationService srv) {
        this.srv = srv;
    }

    @GetMapping()
    public Iterable<Examination> examList() {
        return srv.examList();
    }

    @GetMapping("{id}")
    public Optional<Examination> name(@PathVariable("id") long id) {
        return srv.findById(id);
    }

    @PostMapping()
    public Examination create(@Valid @RequestBody Examination exam) {
        return srv.create(exam);
    }
}