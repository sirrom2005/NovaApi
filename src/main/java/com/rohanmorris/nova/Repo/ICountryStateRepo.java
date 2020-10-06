package com.rohanmorris.nova.Repo;

import java.util.List;

import com.rohanmorris.nova.Model.CountryState;
import org.springframework.data.repository.CrudRepository;

public interface ICountryStateRepo extends CrudRepository<CountryState, Integer> {
    List<CountryState> findBycountryid(int id);
}