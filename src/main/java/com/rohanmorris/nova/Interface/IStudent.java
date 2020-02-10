package com.rohanmorris.nova.Interface;

import com.rohanmorris.nova.Model.Student;
import java.util.HashMap;
import java.util.List;

public interface IStudent {
    public long create(Student student);

    public HashMap<String, List<Student>> read();

    public Student update(int id, Student student);

    public int delete(int id);

    public Student findById(int id);

    public int count();
}