package com.atos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atos.model.AirlineVO;

@Repository
public interface AirlineRepository extends JpaRepository<AirlineVO, Integer> {

}
