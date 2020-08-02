package com.kc.advice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kc.advice.model.City;

@Repository
public interface ICityRepository extends JpaRepository<City, Long> {

}