package com.apidoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class RestApiDocumentationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiDocumentationApplication.class, args);
		log.info("@SpringBootApp Started,");
		
	}

}
