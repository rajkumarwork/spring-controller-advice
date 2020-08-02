package com.kc.advice.service;

import java.util.List;

import com.kc.advice.model.City;


public interface ICityService {

    City findById(Long id);
    City save(City city);
    List<City> findAll();
    
    City getIt();
}