package be.svco.bambola.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import be.svco.bambola.model.Customer;

public interface CustomerRepository extends JpaRepository <Customer, Long> {
	
	Page<Customer> findByLastNameContainingIgnoreCase(String lastName, Pageable pageable);
	
}
