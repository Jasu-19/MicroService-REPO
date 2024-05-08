package com.boa.crs.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "register")
public class RegistrationEntity {
	 @Id
	 @Column(name = "ID")
	 private Long id;
	 
	 @Column(name = "STUDENT_ID")
	 private Long studentId;


	@Column(name = "COURSE_SELECTED")
	private String coursesSelected;
	
	@Column(name = "DEPARTMENT")
	private String depatment;
	
	}
	


