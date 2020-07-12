package com.rohanmorris.nova.Service;

import java.util.Optional;

import com.rohanmorris.nova.Model.ExaminationReport;
import com.rohanmorris.nova.Repo.IExaminationReportRepo;

import org.springframework.stereotype.Service;

@Service
public class ExaminationReportService {
    private IExaminationReportRepo repo;

    /**
     * @param repo
     */
    public ExaminationReportService(IExaminationReportRepo repo) {
        this.repo = repo;
    }

    public Optional<ExaminationReport> findById(long id) {
        return repo.findById(id);
    }
}