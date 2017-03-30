package za.co.sanlam.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import za.co.sanlam.controllers.GreetingController;
import za.co.sanlam.controllers.LoginController;

@SpringBootApplication
@ComponentScan(basePackageClasses = GreetingController.class)
@ComponentScan(basePackageClasses = LoginController.class)
public class Application {
	public static void main(String args []){
		SpringApplication.run(Application.class, args);
		
	}
}
