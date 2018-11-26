package be.svco.bambola.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.svco.bambola.model.Customer;
import be.svco.bambola.service.CustomerService;

@CrossOrigin
@RestController
@RequestMapping({"/customers"})
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping
	public List FindAll() {
		return customerService.findAll();
	}
	
	@PostMapping
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}
	
	@DeleteMapping(path ={"/{id}"})
	public void deleteCustomer(@PathVariable Long id) {
		customerService.deleteCustomer(id);
	}

}
