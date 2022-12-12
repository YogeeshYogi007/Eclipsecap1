package com.cg.FlightCheckIn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FlightCheckInApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightCheckInApplication.class, args);
	}

}
