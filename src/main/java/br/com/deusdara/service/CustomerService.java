package br.com.deusdara.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.deusdara.model.Customer;
import br.com.deusdara.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	
	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public ArrayList<Customer> getAllCustomers() {
		return customerRepository.getAllCustomers();
	}
}