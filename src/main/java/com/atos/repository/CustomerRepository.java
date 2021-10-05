package com.atos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atos.model.CustomerVO;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerVO, Integer> {

}
