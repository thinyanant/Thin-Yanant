package com.trustcore.dao;

import java.util.List;

import com.trustcore.model.Customer;

public interface CustomerInfoDao {
	
	public void saveCustomer(Customer customer);
	public List<Customer> getCustomers();

}
