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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUseEmail() {
		return useEmail;
	}

	public void setUseEmail(String useEmail) {
		this.useEmail = useEmail;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserDepartment() {
		return userDepartment;
	}

	public void setUserDepartment(String userDepartment) {
		this.userDepartment = userDepartment;
	}

	public Date getUserDob() {
		return userDob;
	}

	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}

	public String getCourseAssocaited() {
		return courseAssocaited;
	}

	public void setCourseAssocaited(String courseAssocaited) {
		this.courseAssocaited = courseAssocaited;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	
	
	
	
	
	

}
