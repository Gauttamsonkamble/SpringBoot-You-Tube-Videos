package com.Gauttam.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Gauttam.model.Customer;



public interface CustomerRepo extends JpaRepository<Customer, Integer>
{

	List<Customer> findAll();
}
