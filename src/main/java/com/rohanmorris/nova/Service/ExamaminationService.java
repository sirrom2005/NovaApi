package com.rohanmorris.nova.Service;

import java.util.Optional;

import com.rohanmorris.nova.Model.Examination;
import com.rohanmorris.nova.Repo.IExaminationRepo;

import org.springframework.stereotype.Service;

@Service
public class ExamaminationService {
    private IExaminationRepo repo;

    /**
     * @param repo
     */
    public ExamaminationService(IExaminationRepo repo) {
        this.repo = repo;
    }

    public Optional<Examination> findById(long id) {
        return repo.findById(id);
    }

    public Iterable<Examination> examList() {
        return repo.examList();
    }

    public Examination create(Examination exam) {
        return repo.save(exam);
    }
}