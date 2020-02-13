package com.rohanmorris.nova.Api;

import java.util.List;

import com.rohanmorris.nova.Interface.IValueKeyObject;
import com.rohanmorris.nova.Model.ExtraCurricularActivity;
import com.rohanmorris.nova.Model.Responsibilities;
import com.rohanmorris.nova.Service.ValueKeySevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RequestMapping("api/v1/valuekey")
@RestController
public class ValueKeyController implements IValueKeyObject {
    private final ValueKeySevice srv;

    @Autowired
    public ValueKeyController(ValueKeySevice srv) {
        this.srv = srv;
    }

    @GetMapping("extracurricularactivity")
    @Override
    public List<ExtraCurricularActivity> classList() {
        return srv.classList();
    }

    @GetMapping("responsibilities")
    @Override
    public List<Responsibilities> responsibilities() {
        return srv.responsibilities();
    }
}