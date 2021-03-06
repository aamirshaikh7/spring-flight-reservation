package com.atos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atos.model.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Integer> {

}