package com.boa.crs.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "role")
public class RoleEntity {
	
	@Id
	@Column(name = "ROLE_ID")
	private int id;
	
	@Column(name = "ROLE_NAME")
	private String roleName;

}
