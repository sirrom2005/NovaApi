package com.rohanmorris.nova.Api;

import java.util.Optional;
import javax.validation.Valid;

import com.rohanmorris.nova.Model.Examination;
import com.rohanmorris.nova.Model.ExaminationResults;
import com.rohanmorris.nova.Model.UpcomingExam;
import com.rohanmorris.nova.Service.ExamaminationService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RequestMapping("api/v1/examination")
@RestController
public class ExaminationController {
    private ExamaminationService srv;

    /**
     * @param srv
     */
    public ExaminationController(ExamaminationService srv) {
        this.srv = srv;
    }

    @GetMapping("/list/{id}")
    public Iterable<Examination> examList(@PathVariable("id") long id) {
        return srv.examList(id);
    }

    @GetMapping("{id}")
    public Optional<Examination> name(@PathVariable("id") long id) {
        return srv.findById(id);
    }

    @PostMapping()
    public Examination create(@Valid @RequestBody Examination exam) {
        return srv.create(exam);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") long id) {
        srv.deleteById(id);
    }

    @GetMapping("/student/upcoming_exams/{id}")
    public Iterable<UpcomingExam> getUpcomingExams(@PathVariable("id") long studentId) {
        return srv.getUpcomingExams(studentId);
    }

    @GetMapping("/student/exam_result/{student_id}/{class_id}")
    public Iterable<ExaminationResults> getExamResultsForClassByStudentId(@PathVariable("student_id") long student_id, @PathVariable("class_id") long class_id) {
        return srv.getExamResultsForClassByStudentId(student_id, class_id);
    }
}