package be.svco.bambola.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.svco.bambola.service.CustomerService;


@RestController
@RequestMapping({"/customers"})
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping
	public List FindAll() {
		return customerService.findAll();
	}
	

}
