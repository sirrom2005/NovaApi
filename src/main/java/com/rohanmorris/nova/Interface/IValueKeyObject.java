package com.rohanmorris.nova.Interface;

import java.util.List;

import com.rohanmorris.nova.Model.ClassRoom;
import com.rohanmorris.nova.Model.Country;
import com.rohanmorris.nova.Model.ExtraCurricularActivity;
import com.rohanmorris.nova.Model.HouseColor;
import com.rohanmorris.nova.Model.Responsibilities;

/**
 * IValueKeyObject
 */
public interface IValueKeyObject {

    public List<ExtraCurricularActivity> classList();

    public List<Responsibilities> responsibilities();

    public List<Country> countryList();

    public List<ClassRoom> classList(int schoolId);

    public List<HouseColor> houseColor(int schoolId);
}