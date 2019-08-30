package br.com.deusdara.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import br.com.deusdara.model.Customer;

@Repository
public class CustomerRepository {
	@Autowired
	@Qualifier("CustomersBean")
	ArrayList<Customer> customers;
	
	public void save(Customer customer) {
		customers.add(customer);
	}
	
	public ArrayList<Customer> getAllCustomers() {
		return customers;
	}
}