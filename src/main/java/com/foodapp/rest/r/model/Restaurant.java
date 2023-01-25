package com.foodapp.rest.r.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "restaurant")
public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String RestaurantName;
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getRestaurantName() {
	return RestaurantName;
	}
	public void setRestaurantName(String restaurantName) {
	RestaurantName = restaurantName;
	}


}
