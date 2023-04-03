package com.fap.farmersportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fap.farmersportal.entity.FarmerEntity;

public interface FarmerRepository extends JpaRepository<FarmerEntity, Long> {

}
