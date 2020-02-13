package com.rohanmorris.nova.Repo;

import java.util.List;

import com.rohanmorris.nova.Interface.IValueKeyObject;
import com.rohanmorris.nova.Model.ExtraCurricularActivity;
import com.rohanmorris.nova.Model.Responsibilities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

@SuppressWarnings("unchecked")
@Repository
public class ValueKeyRepo implements IValueKeyObject {

    private SessionFactory sessionFactory;

    public Session getDbSession() {
        return this.sessionFactory.getCurrentSession();
    }

    public ValueKeyRepo(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public List<ExtraCurricularActivity> classList() {
        List<ExtraCurricularActivity> info = getDbSession().createQuery("FROM ExtraCurricularActivity").list();
        if (info != null) {
            return info;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @Override
    public List<Responsibilities> responsibilities() {
        List<Responsibilities> info = getDbSession().createQuery("FROM Responsibilities").list();
        if (info != null) {
            return info;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}