package com.atos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atos.model.CustomerVO;
import com.atos.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repository;
	
	public List<CustomerVO> getAllCustomers () {
		return repository.findAll();
	}
	
	public CustomerVO getCustomerById (int id) {
		Optional<CustomerVO> customer = repository.findById(id);
		
		if (customer.isPresent()) {
            System.out.println(customer);
            return customer.get();
        } else {
            return new CustomerVO(); 
        }
	}
	
	public int newCustomer (CustomerVO customer) {
		Optional<CustomerVO> existsCustomer = repository.findById(customer.getCustomerId());

		int id = 0;
        
        if (existsCustomer.isPresent()) {
            id = -1;
        } else {
        	CustomerVO customer2 = repository.saveAndFlush(customer);
            id = customer2.getCustomerId();
        }
        
        return id;
	}
	
	public int updateCustomer (CustomerVO customer) {
		Optional<CustomerVO> existsCustomer = repository.findById(customer.getCustomerId());

		int id = 0;
        
        if (existsCustomer.isPresent()) {
            id = customer.getCustomerId();
            
            repository.saveAndFlush(customer);
        } else {
        	id = -1;
        }
        
        return id;
	}
	
	public int deleteById (Integer customerId) {
		Optional<CustomerVO> existsCustomer = repository.findById(customerId);

		int id = 0;
        
        if (existsCustomer.isPresent()) {
        	id = customerId;
        	
            repository.deleteById(customerId);
        } else {
        	id = -1;
        }
        
        return id;
	}
}
