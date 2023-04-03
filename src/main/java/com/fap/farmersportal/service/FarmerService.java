package com.fap.farmersportal.service;

import com.fap.farmersportal.entity.FarmerEntity;
import com.fap.farmersportal.entity.FarmerLoginEntity;

public interface FarmerService {
	
	void RegisterFarmer(FarmerEntity farmerEntity);

	boolean verifyFarmerLogin(FarmerLoginEntity farmerLoginEntity);
	
}
