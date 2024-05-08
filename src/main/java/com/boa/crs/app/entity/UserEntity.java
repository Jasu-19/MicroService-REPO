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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserDetailsEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserDetailsEntity userEntity) {
		this.userEntity = userEntity;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	

}
