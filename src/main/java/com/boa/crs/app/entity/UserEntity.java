package com.boa.crs.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
	@Column(name = "ID")
	private Long id ;
	
	@OneToOne
	@JoinColumn(name = "ID")
	private UserDetailsEntity userEntity ;
	
     @Column(name = "TYPE")
	private String userType ;
	
	

}
