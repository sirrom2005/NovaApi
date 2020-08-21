package com.rohanmorris.nova.Repo;

import com.rohanmorris.nova.Model.Examination;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IExaminationRepo extends CrudRepository<Examination, Long>
{
    @Query(value = "SELECT new Examination(x.id, x.name, x.exam_type, x.duration, x.allow_retry, x.subject, x.date_updated) FROM Examination x WHERE x.created_by = ?1 ORDER BY x.name ASC") 
    public Iterable<Examination> examList(long createdBy);
} 