package com.ticket.app.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TicketDiscoverySeriviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketDiscoverySeriviceApplication.class, args);
	}

}
