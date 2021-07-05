package com.certificados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class PortalCertificadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortalCertificadosApplication.class, args);
	}

}
