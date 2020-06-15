package com.Gauttam.Controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Gauttam.dao.CustomerRepo;
import com.Gauttam.model.Customer;





@RestController
@Controller
public class MyController 
{
	@Autowired
	CustomerRepo repo;
	
	@RequestMapping("home")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/addCustomer",method=RequestMethod.GET)
	public String addCustomer(Customer cust)
	{
		repo.save(cust);
		return "index.jsp";
	}
	
	@GetMapping("getUser")
	List<Customer> getUser()
	{
		return repo.findAll();
	}
	

}
