package com.Gauttam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Gauttam.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>
{

}
