package com.boa.crs.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.boa.crs.app.service.CourseService;
import com.boa.crs.app.service.CourseServiceImpl;
import com.boa.crs.app.service.PaymentService;
import com.boa.crs.app.service.PaymentServiceImpl;
import com.boa.crs.app.service.ReportsService;
import com.boa.crs.app.service.ReportsServiceImpl;
import com.boa.crs.app.service.UserService;
import com.boa.crs.app.service.UserServiceImpl;

@Configuration
public class AppConfig {
	
	
	@Bean
	public CourseService courseService()
	{
		return new CourseServiceImpl();
	}
	
	@Bean
	public PaymentService paymentService()
	{
		return new PaymentServiceImpl();
	}
	
	@Bean
	public ReportsService reportsService()
	{
		return new ReportsServiceImpl();
	}
	
	@Bean
	public UserService userService()
	{
		return new UserServiceImpl();
	}
}
