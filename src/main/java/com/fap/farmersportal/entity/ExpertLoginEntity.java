package com.fap.farmersportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tbl_expertdtls")
@Data
public class ExpertLoginEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long experId;
	@Column(name = "email", nullable = false)
	private String experEmail;
	@Column(name = "password", nullable = false)
	private String experPassword; 
}
