package com.foodapp.rest.r;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodapp.rest.r.model.Restaurant;
import com.foodapp.rest.r.service.RestaurantService;

@SpringBootTest

public class RestaurantServiceTest {

	@Autowired
	
	private RestaurantService restaurantService;
	
	@Test
	public void getMenuByRestaurantIdTest() {
		Restaurant r = new Restaurant();
		r.setRestaurantName("Hotel Mint Leaf");
		
		Assertions.assertEquals("Hotel Mint Leaf", restaurantService.getById(18).get().getRestaurantName());
	}
}
