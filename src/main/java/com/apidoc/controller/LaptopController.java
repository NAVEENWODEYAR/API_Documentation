/**
 * 
 */
package com.apidoc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

/**
 * @author Naveen K Wodeyar
 * @date 06-05-2024
 *
 */
@RestController
@RequestMapping("/api/v1/laptop")
public class LaptopController {
	
	@Operation(tags = "Test endPoint,",
				description = "Test endpoint to greet,",
				responses = {@ApiResponse(responseCode = "200",
											description = "SUCCESS")})
	@GetMapping("/greet")
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<Object> greetMsg(){
		return ResponseEntity.ok("Welcome to SWAGGER_API_DOCUMENTATION");
	}
	
	@Hidden
	@DeleteMapping
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<Object> t1(){
		return ResponseEntity.ok("Welcome SWAGGER_API_DOCUMENTATION");
	}

}
