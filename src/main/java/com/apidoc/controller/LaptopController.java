/**
 * 
 */
package com.apidoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.apidoc.dto.ResponseDto;
import com.apidoc.entity.Laptop;
import com.apidoc.repo.LaptopRepo;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;

/**
 * @author Naveen K Wodeyar
 * @date 06-05-2024
 *
 */
@RestController
@RequestMapping("/api/v1/laptop")
public class LaptopController {
	
	@Autowired
	private LaptopRepo laptopRepo;
	
	@Operation(tags = "Test endPoint,",
				description = "Test endpoint to greet,",
				responses = {@ApiResponse(responseCode = "200",
											description = "SUCCESS")})
	@GetMapping("/greet")
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<ResponseDto> greetMsg(){
		ResponseDto response = new ResponseDto(laptopRepo, "Welcome to API Doc",true);
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	@Hidden
	@DeleteMapping
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<Object> t1(){
		return ResponseEntity.ok("Welcome SWAGGER_API_DOCUMENTATION");
	}
	
	@Operation(summary = "Add Laptop",description = "Insert into TABLE",tags = "SAVE")
	@ApiResponses(value = {
							@ApiResponse(responseCode = "200",description = "Save sucessfull,",
										content = {@Content(mediaType = "application/json",
												schema = @Schema(implementation = Laptop.class))}),
							@ApiResponse(responseCode = "400",description = "Save Failed",
										content = @Content)})
	@PostMapping("/saveLaptop")
	public ResponseEntity<Object> addLaptop(@Valid @RequestBody Laptop request){
		return ResponseEntity.ok(laptopRepo.save(request));
		
	}
}
