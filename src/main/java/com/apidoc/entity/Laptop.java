package com.apidoc.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author Naveen K Wodeyar
 * @date 16/05/2024
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
	
	@Column(name = "DOB")
	@JsonFormat(pattern = "dd-MM--yyyy")
	private LocalDate manufacturedDate;

}
