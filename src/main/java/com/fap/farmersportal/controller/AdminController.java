package com.fap.farmersportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fap.farmersportal.entity.AdminLoginEntity;
import com.fap.farmersportal.service.AdminService;

@Controller
public class AdminController {
	
	private AdminService adminService;
	
	public AdminController(AdminService adminService) {
		super();
		this.adminService = adminService;
	}

	@PostMapping("/adminLogin")
	public String verifyLoginDetails(@ModelAttribute(name = "adminLogin") AdminLoginEntity adminLoginEntity,Model model) {
		
		if (adminService.verifyAdminLogin(adminLoginEntity)) {
			return "admin_dashboard";
		} else {
			model.addAttribute("errorMessage", "Email / Password is incorrect, Please try again");
			return "admin_login";
		}
	}	
}
