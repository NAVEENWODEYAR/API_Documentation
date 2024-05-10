/**
 * 
 */
package com.apidoc.dto;

import com.apidoc.entity.Laptop;

import jakarta.persistence.Column;

/**
 * @author Naveen K Wodeyar
 * @date 06-05-2024
 */
public class LaptopDto {
	
	public interface Create{}
	public interface Update{}
	
	private Long lapId;
	
	private String lapModel;
	
	private String lapCompany;
	
	private Double lapPrice;
	
	private String lapReview;
	
	public static LaptopDto build(Laptop laptop) {}

}
