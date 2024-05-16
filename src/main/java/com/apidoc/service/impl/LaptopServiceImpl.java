package com.apidoc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apidoc.repo.LaptopRepo;
import com.apidoc.service.LaptopService;

/**
 * @author Naveen K Wodeyar
 * @date 14/05/2024
 *
 */
@Service
public class LaptopServiceImpl implements LaptopService{

	@Autowired
	private LaptopRepo laptopRepo;
}
