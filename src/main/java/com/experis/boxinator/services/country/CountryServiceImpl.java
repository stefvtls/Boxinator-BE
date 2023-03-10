package com.experis.boxinator.services.country;

import com.experis.boxinator.models.Country;
import com.experis.boxinator.repositories.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository){
        this.countryRepository = countryRepository;
    }
    @Override
    public Country findById(Long id) {
        return countryRepository.getReferenceById(id);
    }

    @Override
    public Collection<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country add(Country entity) {
        return countryRepository.save(entity);
    }

    @Override
    public Country update(Country entity) {
        return countryRepository.saveAndFlush(entity);
    }

    @Override
    public void deleteById(Long id) {countryRepository.deleteById(id);}

    @Override
    public boolean exists(Long id) {
        return countryRepository.existsById(id);
    }
}
