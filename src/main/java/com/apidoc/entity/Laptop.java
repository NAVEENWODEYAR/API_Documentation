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
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "REST_LAPTOP")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Laptop extends AbstractEntity{
	
	@Id
	@Column(name = "LAPTOP_ID")
	private Long lapId;
	
	@Column(name = "LAPTOP_MODEL")
	private String lapModel;
	
	@Column(name = "LAPTOP_COMPANY")
	private String lapCompany;
	
	@Column(name = "LAPTOP_PRICE")
	private Double lapPrice;
	
	@Column(name = "LAPTOP_REVIEW")
	private String lapReview;

}
