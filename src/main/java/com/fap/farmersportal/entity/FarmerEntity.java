package com.fap.farmersportal.entity;

 
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Table(name = "tbl_farmerdtls")
@Data
public class FarmerEntity {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@Column(name = "first_name",nullable = false)
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "birthday")
	private Timestamp birthday;
	@Column(name = "gender")
	private String gender;
	@Column(name = "email",nullable = false)
	private String email;
	@Column(name = "mobileno")
	private Long mobileNo;
	@Column(name = "state")
	private String state;
	@Column(name = "city")
	private String city;
	@Column(name = "address")
	private String address;
	@Column(name = "password")
	private String password;
	@Column(name = "confirm_password")
	private String confirmPassword;
	
}
