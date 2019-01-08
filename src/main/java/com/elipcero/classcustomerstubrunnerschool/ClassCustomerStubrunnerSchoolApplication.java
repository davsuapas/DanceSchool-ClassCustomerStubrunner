package com.elipcero.classcustomerstubrunnerschool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
//@EnableStubRunnerServer
public class ClassCustomerStubrunnerSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassCustomerStubrunnerSchoolApplication.class, args);
	}

	@Component
	private static class Init implements CommandLineRunner {

		private final Logger logger = LoggerFactory.getLogger(Init.class);

		@Override
		public void run(String... args) throws Exception {
			try {
				String address = InetAddress.getByName("artifactory").getHostAddress();
				this.logger.info("--------------------------> Address:" + address);
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
		}
	}
}


