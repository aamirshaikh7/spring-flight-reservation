package com.atos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.atos.model.Checkin;

@Repository
public interface CheckinRepository extends JpaRepository<Checkin, Integer> {

}
