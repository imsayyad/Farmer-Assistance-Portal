package com.fap.farmersportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fap.farmersportal.entity.FarmerLoginEntity;

public interface FarmerLoginRepository extends JpaRepository<FarmerLoginEntity, Long> {
	
	FarmerLoginEntity findByfarmerEmail(String farmerEmail);
	FarmerLoginEntity findByfarmerPassword(String farmerPassword);
}