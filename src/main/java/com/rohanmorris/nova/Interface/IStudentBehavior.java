package com.rohanmorris.nova.Interface;

import java.util.List;

import com.rohanmorris.nova.Model.StudentBehavior;

public interface IStudentBehavior 
{
    public long create(StudentBehavior studentBehavior);

    public StudentBehavior update(long id, StudentBehavior studentBehavior);

    public long delete(long id);

    public StudentBehavior findById(long id);

    public List<StudentBehavior> findByStudentId(long id);
}