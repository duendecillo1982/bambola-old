package be.svco.bambola.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.svco.bambola.model.Customer;
import be.svco.bambola.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List findAll() {
        return customerRepository.findAll();
    }
    
    public Customer findById(Long id) {
    	Optional<Customer> optionalCustomer =  customerRepository.findById(id);
    	Customer customer = optionalCustomer.get();
    	return customer;
    }

	public void addCustomer(Customer customer) {
		customerRepository.save(customer);		
	}

	public void deleteCustomer(Long id) {
		customerRepository.deleteById(id);		
	}

	public Customer update(Customer customer) {
		return customerRepository.save(customer);
	}
}