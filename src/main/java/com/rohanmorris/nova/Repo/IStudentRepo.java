package com.rohanmorris.nova.Repo;

import com.rohanmorris.nova.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student, Long> {}