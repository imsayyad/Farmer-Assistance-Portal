package com.fap.farmersportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fap.farmersportal.entity.AdminLoginEntity;

public interface AdminRepository extends JpaRepository<AdminLoginEntity, Long> {
	
	AdminLoginEntity findByadminEmail(String adminEmail);
	AdminLoginEntity findByadminPassword(String adminPassword);
}
