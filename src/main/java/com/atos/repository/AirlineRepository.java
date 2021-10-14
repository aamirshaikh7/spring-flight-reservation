package com.atos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atos.model.Airline;

public interface AirlineRepository extends JpaRepository<Airline,Integer> {

}
