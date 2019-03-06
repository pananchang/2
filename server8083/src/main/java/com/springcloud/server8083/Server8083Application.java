package com.springcloud.server8083;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class Server8083Application {

	public static void main(String[] args) {
		SpringApplication.run(Server8083Application.class, args);
	}

}
