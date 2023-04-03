package com.fap.farmersportal.service;

import org.springframework.stereotype.Service;

import com.fap.farmersportal.entity.CustomerEntity;
import com.fap.farmersportal.entity.CustomerLoginEntity;
import com.fap.farmersportal.repository.CustomerLoginRepository;
import com.fap.farmersportal.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	private CustomerLoginRepository customerLoginRepository;
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerLoginRepository customerLoginRepository, CustomerRepository customerRepository) {
		super();
		this.customerLoginRepository = customerLoginRepository;
		this.customerRepository = customerRepository;
	}
	
	@Override
	public boolean verifyCustomerLogin(CustomerLoginEntity customerLoginEntity) {
		
		CustomerLoginEntity customerListdata =  customerLoginRepository.findBycustomerEmail(customerLoginEntity.getCustomerEmail());
		
		if ((customerLoginEntity.getCustomerEmail().toLowerCase()).equals(customerListdata.getCustomerEmail().toLowerCase())
				&& customerLoginEntity.getCustomerPassword().equals(customerListdata.getCustomerPassword())) {
			//System.out.println("mail id matched success");
			return true;
		}
		
		return false;
	}

	@Override
	public void RegisterCustomer(CustomerEntity customerEntity) {
		customerRepository.save(customerEntity);
	}
	
}
