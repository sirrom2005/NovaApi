package com.rohanmorris.nova.Repo;

import com.rohanmorris.nova.Interface.IValueKeyObject;
import com.rohanmorris.nova.Model.Citizenship;
import com.rohanmorris.nova.Model.ClassRoom;
import com.rohanmorris.nova.Model.Conduct;
import com.rohanmorris.nova.Model.Country;
import com.rohanmorris.nova.Model.ExaminationDuration;
import com.rohanmorris.nova.Model.ExaminationType;
import com.rohanmorris.nova.Model.ExtraCurricularActivity;
import com.rohanmorris.nova.Model.HouseColor;
import com.rohanmorris.nova.Model.Responsibilities;
import com.rohanmorris.nova.Model.Subject;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.LongType;
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
    public List<ClassRoom> classList(long schoolId) {
        List<ClassRoom> info = getDbSession().createQuery("FROM ClassRoom WHERE school_id = :id")
                .setParameter("id", schoolId, LongType.INSTANCE).list();
        if (info != null) {
            return info;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @Override
    public List<HouseColor> houseColor(long schoolId) {
        List<HouseColor> info = getDbSession().createQuery("FROM HouseColor WHERE school_id = :id")
                .setParameter("id", schoolId, LongType.INSTANCE).list();
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

    @Override
    public List<Conduct> conductList() {
        List<Conduct> info = getDbSession().createQuery("FROM Conduct").list();
        if (info != null) {
            return info;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @Override
    public List<ExaminationType> examinationTypeList() {
        List<ExaminationType> info = getDbSession().createQuery("FROM ExaminationType").list();
        if (info != null) {
            return info;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @Override
    public List<Subject> subjectList() {
        List<Subject> info = getDbSession().createQuery("FROM Subject").list();
        if (info != null) {
            return info;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @Override
    public List<ExaminationDuration> durationList() {
        List<ExaminationDuration> info = getDbSession().createQuery("FROM ExaminationDuration").list();
        if (info != null) {
            return info;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}