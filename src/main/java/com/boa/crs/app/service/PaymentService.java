package com.boa.crs.app.service;

import com.boa.crs.app.entity.PaymentDetailsEntity;

public interface PaymentService {
	public void addPayment(PaymentDetailsEntity Payment);
	public void updatePayment(Long PaymentId, PaymentDetailsEntity Payment);
	public void removePayment(Long PaymentId);

}
