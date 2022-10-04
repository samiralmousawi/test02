package net.codejava.ws;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloRestApplication {

	public static void main(String[] args) {
		
		//SpringApplication.run(HelloRestApplication.class, args);
		
		SpringApplication app = new SpringApplication(HelloRestApplication.class);
        app.setDefaultProperties(Collections
          .singletonMap("server.port", "8081"));
        app.run(args);
	}

}
