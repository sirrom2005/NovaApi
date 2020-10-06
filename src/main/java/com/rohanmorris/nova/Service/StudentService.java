package com.rohanmorris.nova.Service;

import java.util.Optional;

import com.rohanmorris.nova.Model.Student;
import com.rohanmorris.nova.Repo.IStudentRepo;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final IStudentRepo repo;

    /**
     * @param repo
     */
    public StudentService(IStudentRepo repo) {
        this.repo = repo;
    }

    public Student save(Student entity) {
        return repo.save(entity);
    }

    public void deleteById(long id) {
        repo.deleteById(id);
    }

    public Optional<Student> findById(long id) {
        return repo.findById(id);
    }
}