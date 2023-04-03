package com.fap.farmersportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fap.farmersportal.entity.CustomerLoginEntity;

public interface CustomerLoginRepository extends JpaRepository<CustomerLoginEntity, Long> {

	CustomerLoginEntity findBycustomerEmail(String customerEmail);

}
