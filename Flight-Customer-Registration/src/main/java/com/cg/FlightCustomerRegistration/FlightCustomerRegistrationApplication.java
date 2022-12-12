package com.cg.FlightCustomerRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@SpringBootApplication
@EnableEurekaClient
public class FlightCustomerRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightCustomerRegistrationApplication.class, args);
	}

}
