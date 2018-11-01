package de.djamous.multiuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("de.djamous")
@SpringBootApplication
public class MultiUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiUserApplication.class, args);
	}
}
