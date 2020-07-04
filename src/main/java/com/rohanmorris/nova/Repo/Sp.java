package com.rohanmorris.nova.Repo;

import java.util.List;

import com.rohanmorris.nova.Model.Subject;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface Sp extends CrudRepository<Subject, Integer> {
    @Query(nativeQuery = true,value = "call get_subject()") 
    List<Subject> getSubjectSpX();
}