package com.emc.ps.appmod.tnt.usermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class Application {

	public static void main(String[] args) {
		try {
			SpringApplication.run(Application.class, args);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value = "/appInfo", method = RequestMethod.GET)
	public String bookInfo() {
		return "User Management Microservice is running!";
	}

}