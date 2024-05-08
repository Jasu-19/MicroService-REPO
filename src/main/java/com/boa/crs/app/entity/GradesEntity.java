package com.boa.crs.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name ="grades")
public class GradesEntity {
	
	@Id
	@Column(name="ID")
	private Integer student_id;
	
	@Column(name="COURSE_ID")
	private Integer course_id;
	
	@Column(name="GRADE")
	private String grade;

}
