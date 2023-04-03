package com.fap.farmersportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/homepage")
	public String getHomepage() {
		return "homepage";
	}
	
	@GetMapping("/register")
	public String getRegistrationPage() {
		return "register";
	}
	
	@GetMapping("/login")
	public String getLoginPage() {
		return "login";
	}
	
	
	@GetMapping("/farmer_registration")
	public String getFarmerRegistrationPage() {
		return "farmer_registration";
	}
	
	@GetMapping("/customer_registration")
	public String getCustomerRegistrationPage() {
		return "customer_registration";
	}
	
	@GetMapping("/farmer_login")
	public String getFarmerLoginPage() {
		return "farmer_login";
	}
	
	@GetMapping("/customer_login")
	public String getCustomerLoginPage() {
		return "customer_login";
	}
	
	@GetMapping("/expert_login")
	public String getExpertLoginPage() {
		return "expert_login";
	}
	
	@GetMapping("/admin_login")
	public String getAdminLoginPage() {
		return "admin_login";
	}
	
	@GetMapping("/contactus")
	public String getContactUsPage() {
		return "contactus";
	}
	
	@GetMapping("/allproducts")
	public String getAllProductsPage() {
		return "allproducts";
	}
	
	@GetMapping("/notifications")
	public String getNotificationsPage() {
		return "notifications";
	}
	
	@GetMapping("/allquestions")
	public String getAllquestionsPage() {
		return "allquestions";
	}
}
