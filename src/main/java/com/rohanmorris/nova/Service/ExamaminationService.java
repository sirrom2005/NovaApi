package com.rohanmorris.nova.Service;

import java.util.Optional;

import com.rohanmorris.nova.Model.Examination;
import com.rohanmorris.nova.Model.ExaminationResults;
import com.rohanmorris.nova.Model.UpcomingExam;
import com.rohanmorris.nova.Repo.IExaminationRepo;
import com.rohanmorris.nova.Repo.IExaminationResultRepo;
import com.rohanmorris.nova.Repo.IUpcomingExamsRepo;

import org.springframework.stereotype.Service;

@Service
public class ExamaminationService {
    private IExaminationRepo repo;
    private IUpcomingExamsRepo repo2;
    private IExaminationResultRepo repo3;

    /**
     * @param repo
     */
    public ExamaminationService(IExaminationRepo repo, IUpcomingExamsRepo repo2, IExaminationResultRepo repo3) {
        this.repo = repo;
        this.repo2 = repo2;
        this.repo3 = repo3;
    }

    public Optional<Examination> findById(long id) {
        return repo.findById(id);
    }

    public Iterable<Examination> examList(long id) {
        return repo.examList(id);
    }

    public Examination create(Examination exam) {
        return repo.save(exam);
    }

    public void deleteById(long id) {
        repo.deleteById(id);
    }

    public Iterable<UpcomingExam> getUpcomingExams(long studentId) {
        return repo2.getUpcomingExams(studentId);
    }

    public Iterable<ExaminationResults> getExamResultsForClassByStudentId(long student_id, long class_id){
        return repo3.getExamResultsForClassByStudentId(student_id, class_id);
    }
}