package com.rohanmorris.nova.Api;

import com.rohanmorris.nova.Interface.IValueKeyObject;
import com.rohanmorris.nova.Model.Citizenship;
import com.rohanmorris.nova.Model.ClassRoom;
import com.rohanmorris.nova.Model.Country;
import com.rohanmorris.nova.Model.ExtraCurricularActivity;
import com.rohanmorris.nova.Model.HouseColor;
import com.rohanmorris.nova.Model.Responsibilities;
import com.rohanmorris.nova.Service.ValueKeySevice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("country")
    @Override
    public List<Country> countryList() {
        return srv.countryList();
    }

    @GetMapping("class/{schoolid}")
    @Override
    public List<ClassRoom> classList(@PathVariable("schoolid") long schoolId) {
        return srv.classList(schoolId);
    }

    @GetMapping("housecolor/{schoolid}")
    @Override
    public List<HouseColor> houseColor(@PathVariable("schoolid") long schoolid) {
        return srv.houseColor(schoolid);
    }

    @GetMapping("schoolcitizenship")
    @Override
    public List<Citizenship> schoolCitizenship() {
        return srv.schoolCitizenship();
    }
}