package com.rohanmorris.nova.Service;

import java.util.Optional;

import com.rohanmorris.nova.Model.ExamGrade;
import com.rohanmorris.nova.Repo.IExamGrade;

import org.springframework.stereotype.Service;

@Service
public class ExamGradeService {
    private IExamGrade repo;

    /**
     * @param repo
     */
    public ExamGradeService(IExamGrade repo) {
        this.repo = repo;
    }

    public ExamGrade create(ExamGrade grade) {
        return repo.save(grade);
    }
}