package com.rohanmorris.nova.Interface;

import com.rohanmorris.nova.Model.Student;
import com.rohanmorris.nova.Model.StudentInfo;
import java.util.HashMap;
import java.util.List;


public interface IStudent {
    public int create(Student student);

    public HashMap<String, List<Student>> read();

    public Student update(int id, Student student);

    public int delete(int id);

    public StudentInfo findById(int id);

    public int count();
}