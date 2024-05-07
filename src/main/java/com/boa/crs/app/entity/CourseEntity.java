package com.boa.crs.app.entity;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "course_details")
@Data
public class CourseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name="COURSE_NAME")
	private String name;
	
	@Column(name="TOTAL_STUDENTS")
	private int enrolledstudentNumber;
	
	@Column(name="START_DATE")
	private Date startDate;
	@Column(name="END_DATE")
	private Date endDate;
	
	@CreationTimestamp
	@Column(name="CREATED_DATE")
	private Date createdDate;

	
	

}
