package com.example.debit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableEurekaClient
public class DebitApplication {

	public static void main(String[] args) {
		SpringApplication.run(DebitApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
