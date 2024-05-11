/**
 * 
 */
package com.apidoc.dto;

import com.apidoc.entity.Laptop;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * @author Naveen K Wodeyar
 * @date 06-05-2024
 */
public class LaptopDto {
	
	public interface Create{}
	public interface Update{}
	
	@NotNull(groups = Update.class,message = "Laptop Id can't be null,")
	private Long lapId;
	
	@NotBlank(groups = {Create.class,Update.class},message = "Laptop Id can't be null,")
	private String lapModel;
	
	private String lapCompany;
	
	private Double lapPrice;
	
	private String lapReview;
	
	public static LaptopDto build(Laptop laptop) {
		return new LaptopDto();
	}

}
