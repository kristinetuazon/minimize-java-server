package com.minimize.minimizeserver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class MinimizeServerApplication {


	public static void main(String[] args) {
		SpringApplication.run(MinimizeServerApplication.class, args);
	}
}
