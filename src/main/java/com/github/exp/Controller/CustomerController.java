package com.github.exp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.exp.Entity.Customers;
import com.github.exp.ServiceImpl.CustomerServiceImpl;


@RestController
@RequestMapping("/api")
public class CustomerController {

	@Autowired
	private CustomerServiceImpl serviceImpl;
	
	@PostMapping("/addCutom")
	public Customers createCustomer(@RequestBody Customers custom) {
		return serviceImpl.createCutomer(custom);
	}
	
	@GetMapping("/getCustom")
	public List<Customers> getAllCustomers(){
		return serviceImpl.getAllCustomers();
	}
	
	@GetMapping("/{id}")
	public Customers getCustomerById(@PathVariable int id) {
		return serviceImpl.getCustomerById(id);
	}
	
	@PutMapping("/{id}")
	public Customers updateCustomersById(@PathVariable int id, @RequestBody  Customers custom) {
		return serviceImpl.updateCustomer(custom);
	}
	
	@DeleteMapping("/{id}")
	public void DeleteCustomer(@PathVariable int id) {
		serviceImpl.deleteCustomerById(id);
	}
}
