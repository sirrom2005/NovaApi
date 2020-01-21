package com.rohanmorris.nova.Interface;

import java.util.HashMap;
import java.util.List;

import com.rohanmorris.nova.Model.Student;
import com.rohanmorris.nova.Model.StudentInfo;

public interface IPerson {
    public int create(Student student);

    public HashMap<String, List<Student>> read();

    public Student update(int id, Student student);

    public boolean delete(int id);

    public StudentInfo findById(int id);

    public int count();
}