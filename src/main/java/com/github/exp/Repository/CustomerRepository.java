package com.github.exp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.exp.Entity.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Integer>{

	
}
