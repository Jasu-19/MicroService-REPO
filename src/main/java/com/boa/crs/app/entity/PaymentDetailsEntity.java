package com.boa.crs.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "payment_details")
@Data
public class PaymentDetailsEntity {
	@Id
	@Column(name = "TRANSACTION_ID")
	private Long transactionId;
	
	@Column(name="PAYMENT_MODE")
	private String paymentMode;
	
	@Column(name="PAYMENT_STATUS")
	private String paymentStatus;
	
	@Column(name="PAYMENT_TYPE")
	private String paymentType;
	
	@Column(name="PAYMENT_AMOUNT")
	private Long paymentAmount;
	
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="COURSE_ID")
	private int courseId;
}

