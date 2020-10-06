package com.rohanmorris.nova.Repo;

import com.rohanmorris.nova.Model.ClassList;
import org.springframework.data.repository.CrudRepository;

public interface IClassListRepo extends CrudRepository<ClassList, Long> {
    public Iterable<ClassList> findByclassid(long id);
}