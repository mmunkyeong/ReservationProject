package com.project.reservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.project"})
public class ReservationProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationProjectApplication.class, args);
	}

}
