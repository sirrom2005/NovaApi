package com.rohanmorris.nova.Interface;

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


/**
 * IValueKeyObject
 */
public interface IValueKeyObject {

    public List<ExtraCurricularActivity> classList();

    public List<Responsibilities> responsibilities();

    public List<Country> countryList();

    public List<ClassRoom> classList(long schoolId);

    public List<HouseColor> houseColor(long schoolId);

    public List<Citizenship> schoolCitizenship();

    public List<Conduct> conductList();

    public List<ExaminationType> examinationTypeList();

    public List<Subject> subjectList();

    public List<ExaminationDuration> durationList();
}