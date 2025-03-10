package me.api.spring_data_jpa_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		String PORT = System.getenv("PORT");

		SpringApplication.run(Application.class, args);
	}

}
