package com.rohanmorris.nova.Service;

import java.util.List;

import com.rohanmorris.nova.Interface.IValueKeyObject;
import com.rohanmorris.nova.Model.ClassRoom;
import com.rohanmorris.nova.Model.Country;
import com.rohanmorris.nova.Model.ExtraCurricularActivity;
import com.rohanmorris.nova.Model.HouseColor;
import com.rohanmorris.nova.Model.Responsibilities;
import com.rohanmorris.nova.Repo.ValueKeyRepo;

import org.springframework.stereotype.Service;

@Service
public class ValueKeySevice implements IValueKeyObject {
    private final ValueKeyRepo repo;

    public ValueKeySevice(ValueKeyRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<ExtraCurricularActivity> classList() {
        return repo.classList();
    }

    @Override
    public List<Responsibilities> responsibilities() {
        return repo.responsibilities();
    }

    @Override
    public List<Country> countryList() {
        return repo.countryList();
    }

    @Override
    public List<ClassRoom> classList(int schoolId) {
        return repo.classList(schoolId);
    }

    @Override
    public List<HouseColor> houseColor(int schoolId) {
        return repo.houseColor(schoolId);
    }
}