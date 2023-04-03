package com.fap.farmersportal.service;

import com.fap.farmersportal.entity.AdminLoginEntity;

public interface AdminService {
	
	public Boolean verifyAdminLogin(AdminLoginEntity adminLoginEntity);
}
