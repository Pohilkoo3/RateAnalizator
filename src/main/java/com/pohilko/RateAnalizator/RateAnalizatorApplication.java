package com.pohilko.RateAnalizator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.pohilko.RateAnalizator.feign"
		, "com.pohilko.RateAnalizator.controllers"})
public class RateAnalizatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RateAnalizatorApplication.class, args);
	}

}
