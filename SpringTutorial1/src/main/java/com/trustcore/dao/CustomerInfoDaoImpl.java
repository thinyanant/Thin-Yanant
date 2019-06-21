package com.trustcore.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trustcore.model.Customer;

@Repository
@Transactional
public class CustomerInfoDaoImpl implements CustomerInfoDao {
	@Autowired
	private SessionFactory sessionFactory;
	/*
	@Autowired
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;
    }//setSessi
    */
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(customer);
		System.out.println("\n>>>>>>");
	}

	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(Customer.class).list();
	}

}
