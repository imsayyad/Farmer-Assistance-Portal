package com.fap.farmersportal.service;

import java.sql.Timestamp;

import org.springframework.stereotype.Service;

import com.fap.farmersportal.entity.FarmerEntity;
import com.fap.farmersportal.entity.FarmerLoginEntity;
import com.fap.farmersportal.repository.FarmerLoginRepository;
import com.fap.farmersportal.repository.FarmerRepository;

@Service
public class FarmerServiceImpl implements FarmerService {

	private FarmerLoginRepository farmerLoginRepository;
	private FarmerRepository farmerRepository;
	
	public FarmerServiceImpl(FarmerLoginRepository farmerLoginRepository, FarmerRepository farmerRepository) {
		super();
		this.farmerLoginRepository = farmerLoginRepository;
		this.farmerRepository = farmerRepository;
	}

	/**
	 * farmer Login Verification 
	 */
	@Override
	public boolean verifyFarmerLogin(FarmerLoginEntity farmerLoginEntity) {
		
		FarmerLoginEntity farmerListdata =  farmerLoginRepository.findByfarmerEmail(farmerLoginEntity.getFarmerEmail());
		
		if ((farmerLoginEntity.getFarmerEmail().toLowerCase()).equals(farmerListdata.getFarmerEmail().toLowerCase())
				&& farmerLoginEntity.getFarmerPassword().equals(farmerListdata.getFarmerPassword())) {
			//System.out.println("mail id matched success");
			return true;
		}
		
		return false;
	}

	@Override
	public void RegisterFarmer(FarmerEntity farmerEntity) {
		Timestamp birthDate = farmerEntity.getBirthday();
		String birthDateString = birthDate.toString();
		Timestamp birthDateTimestamp = Timestamp.valueOf(birthDateString);
		farmerEntity.setBirthday(birthDateTimestamp);
		farmerRepository.save(farmerEntity);
	}
	
	

}
