package com.rohanmorris.nova.Service;

import java.util.List;

import com.rohanmorris.nova.Model.Country;
import com.rohanmorris.nova.Repo.CountryRepo;

import org.springframework.stereotype.Service;

/**
 * CountryService
 */
@Service
public class CountryService {
    private final CountryRepo repo;

    /**
     * @param repo
     */
    public CountryService(CountryRepo repo) {
        this.repo = repo;
    }

    public List<Country> read() {
        return repo.read();
    }
}