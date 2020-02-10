package com.rohanmorris.nova.Api;

import java.util.List;

import com.rohanmorris.nova.Model.Country;
import com.rohanmorris.nova.Service.CountryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CountryController
 */
@CrossOrigin(maxAge = 3600)
@RequestMapping("api/v1/country")
@RestController
public class CountryController {
    private final CountryService srv;

    @Autowired
    public CountryController(CountryService srv) {
        this.srv = srv;
    }

    @GetMapping()
    public List<Country> read() {
        return srv.read();
    }
}