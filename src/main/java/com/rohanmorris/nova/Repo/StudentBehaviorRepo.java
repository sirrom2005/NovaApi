package com.rohanmorris.nova.Repo;

import java.util.List;

import javax.transaction.Transactional;

import com.rohanmorris.nova.Interface.IStudentBehavior;
import com.rohanmorris.nova.Model.StudentBehavior;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LongType;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

@Transactional
@Repository
public class StudentBehaviorRepo implements IStudentBehavior {

    private SessionFactory sessionFactory;

    public Session getDbSession() {
        return this.sessionFactory.getCurrentSession();
    }

    public StudentBehaviorRepo(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public long create(StudentBehavior studentBehavior) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public StudentBehavior update(long id, StudentBehavior studentBehavior) {
        // TODO Auto-generated method stub
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<StudentBehavior> read() {
        List<StudentBehavior> info = getDbSession().createQuery("FROM StudentBehavior").list();
        if (info != null) {
            return info;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @Override
    public StudentBehavior findById(long id) {
        StudentBehavior info = (StudentBehavior) getDbSession()
                .createQuery("FROM StudentBehavior WHERE student_id = :id").setParameter("id", id, LongType.INSTANCE)
                .uniqueResult();
        if (info != null) {
            return info;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<StudentBehavior> findByStudentId(long id) {
        List<StudentBehavior> info = getDbSession()
                .createQuery("FROM StudentBehavior WHERE student_id = :student_id")
                .setParameter("student_id", id, LongType.INSTANCE).list();
        if (info != null) {
            return info;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}