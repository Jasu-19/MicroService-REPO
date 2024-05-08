package com.boa.crs.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "payment")
public class PaymentEntity {
	
	@Id
	@Column(name = "PAYMENT_ID")
	private Long id;
	
	@Column(name = "PAYMENT_TYPE")
	private String paymentType;

}
