/**
 * 
 */
package com.apidoc.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LENOVO
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Laptop {
	
	private Long lapId;
	
	private String lapModel;
	
	private String lapCompany;
	
	private Double lapPrice;
	
	private String lapReview;

}
