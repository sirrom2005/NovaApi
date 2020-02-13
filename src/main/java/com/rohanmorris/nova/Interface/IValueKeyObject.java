package com.rohanmorris.nova.Interface;

import java.util.List;

import com.rohanmorris.nova.Model.ExtraCurricularActivity;
import com.rohanmorris.nova.Model.Responsibilities;

/**
 * IValueKeyObject
 */
public interface IValueKeyObject {

    public List<ExtraCurricularActivity> classList();

    public List<Responsibilities> responsibilities();
}