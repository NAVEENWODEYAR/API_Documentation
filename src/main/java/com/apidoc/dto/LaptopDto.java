/**
 * 
 */
package com.apidoc.dto;

import com.apidoc.entity.Laptop;
import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Naveen K Wodeyar
 * @date 06-05-2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LaptopDto {
	
	public interface Create{}
	public interface Update{}
	
	@NotNull(groups = Update.class,message = "Laptop Id can't be null,")
	private Long lapId;
	
	@NotBlank(groups = {Create.class,Update.class},message = "Laptop model can't be null,")
	private String lapModel;
	
	@NotBlank(groups = {Create.class,Update.class},message = "Company name can't be null,")
	private String lapCompany;
	
	@NotNull(groups = {Create.class,Update.class},message = "Laptop price can't be null,")
	private Double lapPrice;
	
	@NotBlank(groups = {Create.class,Update.class},message = "Laptop Review can't be null,")
	private String lapReview;
	
	public static LaptopDto build(Laptop laptop) {
		return new LaptopDto(laptop.getLapId(),
							 laptop.getLapModel(),
							 laptop.getLapCompany(),
							 laptop.getLapPrice(),
							 laptop.getLapReview());
		}
}
