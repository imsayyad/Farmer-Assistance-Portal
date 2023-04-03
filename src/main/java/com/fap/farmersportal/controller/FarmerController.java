package com.fap.farmersportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fap.farmersportal.entity.FarmerEntity;
import com.fap.farmersportal.entity.FarmerLoginEntity;
import com.fap.farmersportal.service.FarmerService;

@Controller
public class FarmerController {

	private FarmerService farmerService;

	public FarmerController(FarmerService farmerService) {
		super();
		this.farmerService = farmerService;
	}

	@PostMapping("/farmerLogin")
	public String verifyLoginDetails(@ModelAttribute(name = "farmerLogin") FarmerLoginEntity farmerLoginEntity,
			Model model) {

		if (farmerService.verifyFarmerLogin(farmerLoginEntity)) {
			return "farmer_dashboard";
		} else {
			model.addAttribute("errorMessage", "Email / Password is incorrect, Please try again");
			return "farmer_login";
		}
	}

	@PostMapping("/farmerregistration")
	public String RegisterFarmer(@ModelAttribute(name = "farmerregistration") FarmerEntity farmerEntity, Model model) {
		farmerService.RegisterFarmer(farmerEntity);
		return "homepage";
	}
}
