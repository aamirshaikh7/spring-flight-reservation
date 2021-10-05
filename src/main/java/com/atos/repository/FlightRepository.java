package com.atos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atos.model.TicketVO;

@Repository
public interface FlightRepository extends JpaRepository<TicketVO, Integer> {

}
