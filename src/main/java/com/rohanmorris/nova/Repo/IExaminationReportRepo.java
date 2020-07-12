package com.rohanmorris.nova.Repo;

import com.rohanmorris.nova.Model.ExaminationReport;
import org.springframework.data.repository.CrudRepository;

public interface IExaminationReportRepo extends CrudRepository<ExaminationReport, Long> {}