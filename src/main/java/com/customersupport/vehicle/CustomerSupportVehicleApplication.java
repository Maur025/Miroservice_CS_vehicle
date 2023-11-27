package com.customersupport.vehicle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication

public class CustomerSupportVehicleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerSupportVehicleApplication.class, args);
	}

}
