package com.elipcero.classcustomerstubrunnerschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.contract.stubrunner.server.EnableStubRunnerServer;

@SpringBootApplication
@EnableStubRunnerServer
public class ClassCustomerStubrunnerSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassCustomerStubrunnerSchoolApplication.class, args);
	}

}
