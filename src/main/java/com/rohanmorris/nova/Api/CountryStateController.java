package com.rohanmorris.nova.Api;

import java.util.List;

import com.rohanmorris.nova.Model.CountryState;
import com.rohanmorris.nova.Service.CountryStateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RequestMapping("api/v1/countrystate")
@RestController
public class CountryStateController {
    private final CountryStateService srv;

    @Autowired
    public CountryStateController(CountryStateService srv) {
        this.srv = srv;
    }

    @GetMapping("{id}")
    public List<CountryState> findById(@PathVariable("id") int id) {
        return srv.findByCountryId(id);
    }
}