package com.foodapp.rest.r.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.foodapp.rest.r.repo.CategoryRepo;
import com.foodapp.rest.r.repo.FoodItemRepo;

@RestController
public class FoodItemController {

	@Autowired
	private FoodItemRepo foodItemRepo;
	
	@Autowired
	private CategoryRepo categoryRepo;
	
	
}
