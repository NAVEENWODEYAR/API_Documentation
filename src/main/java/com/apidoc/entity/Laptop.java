/**
 * 
 */
package com.apidoc.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author LENOVO
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "REST_LAPTOP")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Laptop {
	
	private Long lapId;
	
	private String lapModel;
	
	private String lapCompany;
	
	private Double lapPrice;
	
	private String lapReview;

}
