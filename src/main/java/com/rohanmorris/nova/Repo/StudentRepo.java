package com.rohanmorris.nova.Repo;

import com.rohanmorris.nova.Interface.IStudent;
import com.rohanmorris.nova.Model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.IntegerType;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

@Transactional
@Repository
public class StudentRepo implements IStudent {

    private SessionFactory sessionFactory;

    public Session getDbSession() {
        return this.sessionFactory.getCurrentSession();
    }

    public StudentRepo(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public Student findById(int id) {
        Student info = (Student) getDbSession().createQuery("FROM Student WHERE account_id = :id")
                .setParameter("id", id, IntegerType.INSTANCE).uniqueResult();
        if (info != null) {
            return info;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @SuppressWarnings("unchecked")
    @Override
    public HashMap<String, List<Student>> read() {
        HashMap<String, List<Student>> studentMap = new HashMap<String, List<Student>>();
        List<Student> student = getDbSession().createQuery("FROM Student WHERE school_id = :id")
                .setParameter("id", 1201103719, IntegerType.INSTANCE).list();
        List<String> grade = student.stream().map(Student::getFormclass).distinct().collect(Collectors.toList());

        grade.forEach(T -> {
            studentMap.put(T, student.stream().filter(p -> p.getFormclass().equals(T)).collect(Collectors.toList()));
        });

        return studentMap;
    }

    @Override
    public int delete(int id) {
        int rs = getDbSession().createSQLQuery("DELETE FROM accounts WHERE id = :id")
                .setParameter("id", id, IntegerType.INSTANCE).executeUpdate();
        if (rs > 0) {
            return rs;
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @Override
    public int count() {
        Object q = getDbSession().createQuery("SELECT count(*) as cnt FROM Student").uniqueResult();
        return Integer.parseInt(String.valueOf(q));
    }
}