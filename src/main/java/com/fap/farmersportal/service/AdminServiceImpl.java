package com.fap.farmersportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fap.farmersportal.entity.AdminLoginEntity;
import com.fap.farmersportal.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	private AdminRepository adminRepository;
	
	@Autowired
	public AdminServiceImpl(AdminRepository adminRepository) {
		super();
		this.adminRepository = adminRepository;
	}

	@Override
	public Boolean verifyAdminLogin(AdminLoginEntity adminLoginEntity) {
		/*System.out.println("first == "+adminLoginEntity.getAdminEmail());
		System.out.println("second == "+adminLoginEntity.getAdminPassword());
		
		System.out.println("Third == "+adminRepository.findByadminEmail(adminLoginEntity.getAdminEmail()));*/
		
		AdminLoginEntity adminListdata =  adminRepository.findByadminEmail(adminLoginEntity.getAdminEmail());
		
		
		if ((adminLoginEntity.getAdminEmail().toLowerCase()).equals(adminListdata.getAdminEmail().toLowerCase())
				&& adminLoginEntity.getAdminPassword().equals(adminListdata.getAdminPassword())) {
			//System.out.println("mail id matched success");
			return true;
		}
		
		return false;
	}
}
