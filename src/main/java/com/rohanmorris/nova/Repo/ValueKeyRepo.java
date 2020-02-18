package com.rohanmorris.nova.Repo;

import com.rohanmorris.nova.Interface.IValueKeyObject;
import com.rohanmorris.nova.Model.Citizenship;
import com.rohanmorris.nova.Model.ClassRoom;
import com.rohanmorris.nova.Model.Country;
import com.rohanmorris.nova.Model.ExtraCurricularActivity;
import com.rohanmorris.nova.Model.HouseColor;
import com.rohanmorris.nova.Model.Responsibilities;
import java.util.List;
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

    @Override
    public List<Country> countryList() {
        List<Country> info = getDbSession().createQuery("FROM Country").list();
        if (info != null) {
            return info;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @Override
    public List<ClassRoom> classList(int schoolId) {
        List<ClassRoom> info = getDbSession().createQuery("FROM ClassRoom WHERE school_id = :id")
                .setParameter("id", schoolId).list();
        if (info != null) {
            return info;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @Override
    public List<HouseColor> houseColor(int schoolId) {
        List<HouseColor> info = getDbSession().createQuery("FROM HouseColor WHERE school_id = :id")
                .setParameter("id", schoolId).list();
        if (info != null) {
            return info;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @Override
    public List<Citizenship> schoolCitizenship() {
        List<Citizenship> info = getDbSession().createQuery("FROM Citizenship").list();
        if (info != null) {
            return info;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}