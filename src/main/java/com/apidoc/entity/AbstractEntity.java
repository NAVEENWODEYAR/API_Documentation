/**
 * 
 */
package com.apidoc.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author Naveen K Wodeyar
 * Class serves as superclass for the entity to manage the date and user details,
 *
 */
@Data
@MappedSuperclass
public class AbstractEntity {
	
	@Column(name = "CREATED_DATE",nullable = false)
	private LocalDateTime created;
	
	@Column(name = "CREATED_BY")
	private String createdBy;
	
	@Column(name = "MODIFIED_DATE")
	private LocalDateTime modified;
	
	@Column(name = "MODIFIED_BY")
	private String modifiedBy;
	
	@PrePersist
	protected void onCreate () {created = LocalDateTime.now();}
	
	@PreUpdate
	protected void onModified() {modified = LocalDateTime.now();}

}
