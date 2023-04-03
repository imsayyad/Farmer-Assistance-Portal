package com.fap.farmersportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fap.farmersportal.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

}
