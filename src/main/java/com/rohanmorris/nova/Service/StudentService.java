package com.rohanmorris.nova.Service;

import com.rohanmorris.nova.Model.Student;
import com.rohanmorris.nova.Model.StudentInfo;
import com.rohanmorris.nova.Repo.PersonRepo;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final PersonRepo repo;

    /**
     * @param repo
     */
    public StudentService(PersonRepo repo) {
        this.repo = repo;
    }

    public HashMap<String, List<Student>> read() {
        return repo.read();
    }

    public int create(Student student) {
        return repo.create(student);
    }

    public StudentInfo findById(int id) {
        return repo.findById(id);
    }

    public Student update(int id, Student student) {
        return repo.update(id, student);
    }

    public int delete(int id) {
        return repo.delete(id);
    }

    public int getCount() {
        return repo.count();
    }
}