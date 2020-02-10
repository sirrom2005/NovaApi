package com.rohanmorris.nova.Repo;

import java.util.List;

import com.rohanmorris.nova.Model.Country;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

/**
 * CountryRepo
 */
@Repository
public class CountryRepo {
    
    private SessionFactory sessionFactory;

    public Session getDbSession() {
        return this.sessionFactory.getCurrentSession();
    }

    public CountryRepo(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @SuppressWarnings("unchecked")
    public List<Country> read() {
        List<Country> info = getDbSession().createQuery("FROM Country").list();
        if (info != null) {
            return info;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}