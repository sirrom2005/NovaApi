package com.rohanmorris.nova.Service;

import java.util.List;

import com.rohanmorris.nova.Interface.IValueKeyObject;
import com.rohanmorris.nova.Model.ExtraCurricularActivity;
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
}