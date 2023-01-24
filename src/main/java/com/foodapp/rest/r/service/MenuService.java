package com.foodapp.rest.r.service;

import org.springframework.beans.factory.annotation.Autowired;


import com.foodapp.rest.r.model.Menu;
import com.foodapp.rest.r.repo.MenuRepo;

public class MenuService {

	
	@Autowired
	private MenuRepo menuRepo;
	
	public void postMenu(Menu menu) {
		menuRepo.save(menu);
	}
}
