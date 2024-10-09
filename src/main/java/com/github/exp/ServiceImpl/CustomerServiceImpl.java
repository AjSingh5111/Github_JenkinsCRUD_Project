package com.github.exp.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.exp.Entity.Customers;
import com.github.exp.Repository.CustomerRepository;

@Service
public class CustomerServiceImpl {

	@Autowired
	private CustomerRepository repository;
	
	
	public Customers createCutomer(Customers customers) {
		return repository.save(customers);
	}
	
 public List<Customers> getAllCustomers(){
	 return repository.findAll();
 }
 
 public Customers getCustomerById(int id) {
	 return repository.findById(id).get();
 }
 
 public Customers updateCustomer(Customers customer) {
		Customers existingUser = repository.findById(customer.getId()).get();
     existingUser.setName(customer.getName());
     existingUser.setCity(customer.getCity());
     
     Customers updatedCustomer = repository.save(existingUser);
     return updatedCustomer;
	
	}
 
 public void deleteCustomerById(int id) {
	 repository.deleteById(id);
 }
 
}
