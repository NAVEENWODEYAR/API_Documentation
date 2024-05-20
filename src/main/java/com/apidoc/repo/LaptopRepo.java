package com.apidoc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apidoc.entity.Laptop;

/**
 * @author Naveen K Wodeyar,
 *
 */
public interface LaptopRepo extends JpaRepository<Laptop, Long> {

}
