package com.msPaquetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.persistence2.repository")
@EntityScan("com.persistence2.entity")
public class MsPaquetesApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SpringApplication.run(MsPaquetesApplication.class, args);
	}

}
