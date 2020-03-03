package com.rohanmorris.nova.Service;

import java.util.List;

import com.rohanmorris.nova.Interface.IStudentBehavior;
import com.rohanmorris.nova.Model.StudentBehavior;
import com.rohanmorris.nova.Repo.StudentBehaviorRepo;

import org.springframework.stereotype.Service;

@Service
public class StudentBehaviorService implements IStudentBehavior {
    private StudentBehaviorRepo repo;

    public StudentBehaviorService(StudentBehaviorRepo repo) {
        this.repo = repo;
    }
    
    @Override
    public long create(StudentBehavior studentBehavior) {
        return repo.create(studentBehavior);
    }

    @Override
    public StudentBehavior update(long id, StudentBehavior studentBehavior) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StudentBehavior findById(long id) {
        return repo.findById(id);
    }

    @Override
    public List<StudentBehavior> findByStudentId(long id) {
        return repo.findByStudentId(id);
    }

    @Override
    public long delete(long id) {
        return repo.delete(id);
    }
}