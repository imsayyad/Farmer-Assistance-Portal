package com.fap.farmersportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tbl_admindtls")
@Data
public class AdminLoginEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long adminId;
	@Column(name = "email", nullable = false)
	private String adminEmail;
	@Column(name = "password", nullable = false)
	private String adminPassword; 
	
}
