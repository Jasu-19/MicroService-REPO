package com.boa.crs.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class UserEntity {
	
	@Id
	@Column(name = "USER_ID")
	private Long id ;
	
	@OneToOne
	@JoinColumn(name = "ID")
	private UserDetailsEntity userEntity ;
	
     @Column(name = "TYPE")
	private String userType ;
	
	

}
