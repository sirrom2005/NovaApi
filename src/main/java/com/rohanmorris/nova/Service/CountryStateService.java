package com.rohanmorris.nova.Service;

import java.util.List;

import com.rohanmorris.nova.Model.CountryState;
import com.rohanmorris.nova.Repo.ICountryStateRepo;
import org.springframework.stereotype.Service;

@Service
public class CountryStateService {

    private final ICountryStateRepo repo;

    /**
     * @param repo
     */
    public CountryStateService(ICountryStateRepo repo) {
        this.repo = repo;
    }

    public List<CountryState> findByCountryId(int id) {
        return repo.findBycountryid(id);
    }
}