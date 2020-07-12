package com.rohanmorris.nova.Api;

import java.util.Optional;

import com.rohanmorris.nova.Model.ExaminationReport;
import com.rohanmorris.nova.Service.ExaminationReportService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RequestMapping("api/v1/examinationreport")
@RestController
public class ExaminationReportController {
    private ExaminationReportService srv;

    /**
     * @param srv
     */
    public ExaminationReportController(ExaminationReportService srv) {
        this.srv = srv;
    }

    @GetMapping("{id}")
    public Optional<ExaminationReport> findById(@PathVariable("id") long id) {
        return srv.findById(id);
    }
}