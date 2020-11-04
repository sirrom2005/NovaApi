package com.rohanmorris.nova.Repo;

import com.rohanmorris.nova.Model.ExaminationResults;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IExaminationResultRepo extends CrudRepository<ExaminationResults, Long>
{
    @Query(value = "SELECT x.* FROM view_examination_results x WHERE x.student_id = ?1 AND x.class_id = ?2", nativeQuery = true) 
    public Iterable<ExaminationResults> getExamResultsForClassByStudentId(long student_id, long class_id);
} 