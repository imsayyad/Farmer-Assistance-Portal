package com.fap.farmersportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fap.farmersportal.entity.CustomerEntity;
import com.fap.farmersportal.entity.CustomerLoginEntity;
import com.fap.farmersportal.service.CustomerService;

@Controller
public class CustomerController {

		private CustomerService customerService;

		public CustomerController(CustomerService customerService) {
			super();
			this.customerService = customerService;
		}
		
		@PostMapping("/customerLogin")
		public String verifyLoginDetails(@ModelAttribute(name = "customerLogin") CustomerLoginEntity customerLoginEntity,
				Model model) {

			if (customerService.verifyCustomerLogin(customerLoginEntity)) {
				return "customer_dashboard";
			} else {
				model.addAttribute("errorMessage", "Email / Password is incorrect, Please try again");
				return "customer_login";
			}
		}

		@PostMapping("/customerRegistration")
		public String RegisterCustomer(@ModelAttribute(name = "customerRegistration") CustomerEntity customerEntity, Model model) {
			customerService.RegisterCustomer(customerEntity);
			return "homepage";
		}
}
