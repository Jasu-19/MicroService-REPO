package com.boa.crs.app.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boa.crs.app.entity.PaymentDetailsEntity;
import com.boa.crs.app.service.PaymentService;

@RestController
@RequestMapping("/crs-services/api/payment")
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
	
	@PostMapping
	public String addPayment(@RequestBody PaymentDetailsEntity paymentDetailsEntity) {
		paymentService.addPayment(paymentDetailsEntity);
		return "Payment transaction completed successfully";
	}
	
//	@PutMapping
//	public String updatePayment(@RequestBody PaymentDetailsEntity paymentDetailsEntity) {
//		paymentService.updatePayment(paymentDetailsEntity);
//		return "Payment transaction details updated successfully";
//	}
//	
//	@DeleteMapping
//	public String removePayment(Long paymentId) {
//		paymentService.removePayment(paymentId);
//		return "Payment transaction deleted successfully";
//	}

}
