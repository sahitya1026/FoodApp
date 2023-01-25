package com.foodapp.rest.r.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "menu")
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@OneToMany
	private List<Category> category;

	public String getName() {
		return name;
	}

	public List<Category> getCategory() {
		return category;
	}

	public void setCategory(List<Category> category) {
		this.category = category;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
