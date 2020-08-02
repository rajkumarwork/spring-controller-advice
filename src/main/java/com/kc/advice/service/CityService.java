package com.kc.advice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kc.advice.exception.CityNotFoundException;
import com.kc.advice.exception.MyException;
import com.kc.advice.exception.NoDataFoundException;
import com.kc.advice.model.City;

@Service
public class CityService implements ICityService {

    //@Autowired
    //ICityRepository cityRepository;
	@Override
	public City getIt() {
		throw new MyException();
	}
	
    @Override
    public City findById(Long id) {
        /*return cityRepository.findById(id)
                .orElseThrow(() -> new CityNotFoundException(id));*/
    	throw new CityNotFoundException(id);
    }

    @Override
    public City save(City city) {
    	 throw new NoDataFoundException();
        //return cityRepository.save(city);
    }

    @Override
    public List<City> findAll() {
    	//List<City> cities = (List<City>) cityRepository.findAll();
 //       if (cities.isEmpty()) {
            throw new NoDataFoundException();
   //     }
     //   return cities;
    }
    
}
