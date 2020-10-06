package com.rohanmorris.nova.Service;

import com.rohanmorris.nova.Model.ClassList;
import com.rohanmorris.nova.Repo.IClassListRepo;
import org.springframework.stereotype.Service;

@Service
public class ClassListService {
    private IClassListRepo repo;

    public ClassListService(IClassListRepo repo) {
        this.repo = repo;
    }

    public Iterable<ClassList> findByClassId(long id) {
        return repo.findByclassid(id);
    }
}