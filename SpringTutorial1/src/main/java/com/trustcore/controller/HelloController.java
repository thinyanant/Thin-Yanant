package com.trustcore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.trustcore.dao.CustomerInfoDao;
import com.trustcore.model.Customer;

@Controller
public class HelloController {
	@Autowired
	CustomerInfoDao customerDao;
	
	@RequestMapping(value="/index.htm")
	public String welcome(Model model){
		model.addAttribute("msg", "Hello World");
		model.addAttribute("person", new Customer());
		return "welcome";
	}
	@RequestMapping(value="/postInfo.htm",method=RequestMethod.POST)
	public String submitData(Model model,@ModelAttribute(value="person") Customer person){
		customerDao.saveCustomer(person);
		model.addAttribute("customerList", customerDao.getCustomers());
		return "info";
	}

}
