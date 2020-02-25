package com.rohanmorris.nova.Interface;

import com.rohanmorris.nova.Model.Citizenship;
import com.rohanmorris.nova.Model.ClassRoom;
import com.rohanmorris.nova.Model.Country;
import com.rohanmorris.nova.Model.ExtraCurricularActivity;
import com.rohanmorris.nova.Model.HouseColor;
import com.rohanmorris.nova.Model.Responsibilities;
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
}