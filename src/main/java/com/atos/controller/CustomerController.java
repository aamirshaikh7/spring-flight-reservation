package com.atos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atos.model.CustomerVO;
import com.atos.services.CustomerService;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping(value="/list")
	public ResponseEntity<List<CustomerVO>> getAllCustomers() {
		return new ResponseEntity<List<CustomerVO>>(service.getAllCustomers(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
    public ResponseEntity<CustomerVO> getCustomerById(@PathVariable Integer id) {
        return new ResponseEntity<CustomerVO>(service.getCustomerById(id), HttpStatus.OK);
    }
 
    @PostMapping(value = "/save")
    public ResponseEntity<Integer> newCustomer(@RequestBody CustomerVO customer) {
        System.out.println("controller : " + customer);
        return new ResponseEntity<Integer>(service.newCustomer(customer), HttpStatus.OK);
    }
 
    @PatchMapping(value = "/update")
    public ResponseEntity<Integer> updateCustomer(@RequestBody CustomerVO customer) {
        return new ResponseEntity<Integer>(service.updateCustomer(customer), HttpStatus.OK);
    }
 
    @DeleteMapping(value = "/delete")
    public ResponseEntity<Integer> deleteCustomerById(@RequestBody CustomerVO customer) {
        return new ResponseEntity<Integer>(service.deleteById(customer.getCustomerId()), HttpStatus.OK);
    }
}
