package be.svco.bambola.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.svco.bambola.model.Customer;
import be.svco.bambola.service.CustomerService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({ "/customers" })
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping
	public List findAll() {
		return customerService.findAll();
	}

	@GetMapping(path = { "/{id}" })
	public Customer findOne(@PathVariable("id") long id) {
		return customerService.findById(id);
	}
	
    @PutMapping(path = {"/{id}"})
    public Customer update(@PathVariable("id") long id, @RequestBody Customer customer){
    	customer.setId(id);
        return customerService.update(customer);
    }

	@PostMapping
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}
	
	@DeleteMapping(path = { "/{id}" })
	public void deleteCustomer(@PathVariable Long id) {
		customerService.deleteCustomer(id);
	}

}
