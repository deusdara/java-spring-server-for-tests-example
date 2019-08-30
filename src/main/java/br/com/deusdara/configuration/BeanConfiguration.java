package br.com.deusdara.configuration;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.deusdara.model.Customer;

@Configuration
public class BeanConfiguration {
	@Bean(name = "CustomersBean")
	public ArrayList<Customer> getCustomers() {
		return new ArrayList<Customer>();
	}
}
