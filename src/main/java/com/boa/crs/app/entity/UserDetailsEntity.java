package com.boa.crs.app.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="user_details")
@Data
public class UserDetailsEntity {
	
	@Id
	@Column(name = "USER_ID")
	private Long userId;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="USER_EMAIL")
	private String useEmail;
	
	@Column(name="USER_TYPE")
	private String userType;
	
	@Column(name="USER_DEPARTMENT")
	private String userDepartment;
	
	@Column(name="USER_DOB")
	private Date userDob;
	
	@Column(name="COURSE_ASSOCIATED")
	private String courseAssocaited;
	
	@Column(name="VALID_USER")
	private boolean isValid;
	
	
	
	

}
