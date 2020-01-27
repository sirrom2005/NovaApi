package com.rohanmorris.nova.Repo;

import java.util.List;

import javax.transaction.Transactional;
import com.rohanmorris.nova.Interface.ISchool;
import com.rohanmorris.nova.Model.School;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.IntegerType;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

@Transactional
@Repository
public class SchoolRepo implements ISchool {

    private SessionFactory sessionFactory;

    public Session getDbSession() {
        return this.sessionFactory.getCurrentSession();
    }

    public SchoolRepo(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public int create(School student) {
        // TODO Auto-generated method stub
        return 0;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<School> read() {
        List<School> info = getDbSession().createQuery("FROM School").list();
        if (info != null) {
            return info;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @Override
    public School update(int id, School school) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int delete(int id) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public School findById(int id) {
        School info = (School) getDbSession().createQuery("FROM School WHERE id = :id")
                .setParameter("id", id, IntegerType.INSTANCE).uniqueResult();
        if (info != null) {
            return info;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

}