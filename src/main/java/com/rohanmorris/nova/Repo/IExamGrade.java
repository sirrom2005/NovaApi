package com.rohanmorris.nova.Repo;

import com.rohanmorris.nova.Model.ExamGrade;

import org.springframework.data.repository.CrudRepository;

public interface IExamGrade extends CrudRepository<ExamGrade, Long> {}