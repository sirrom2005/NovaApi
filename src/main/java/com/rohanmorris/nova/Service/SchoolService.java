package com.rohanmorris.nova.Service;

import java.util.List;

import com.rohanmorris.nova.Model.School;
import com.rohanmorris.nova.Repo.SchoolRepo;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {

    private final SchoolRepo repo;

    /**
     * @param repo
     */
    public SchoolService(SchoolRepo repo) {
        this.repo = repo;
    }

    public School findById(int id) {
        return repo.findById(id);
    }

    public List<School> read() {
        return repo.read();
    }
}