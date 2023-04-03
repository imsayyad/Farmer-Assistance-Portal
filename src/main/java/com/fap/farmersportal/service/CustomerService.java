package com.fap.farmersportal.service;

import com.fap.farmersportal.entity.CustomerEntity;
import com.fap.farmersportal.entity.CustomerLoginEntity;

public interface CustomerService {

	void RegisterCustomer(CustomerEntity customerEntity);

	boolean verifyCustomerLogin(CustomerLoginEntity customerLoginEntity);

}
