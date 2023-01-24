package com.foodapp.rest.r.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.foodapp.rest.r.model.Menu;
import com.foodapp.rest.r.repo.MenuRepo;

@Service
public class MenuService {

	
	@Autowired
	private MenuRepo menuRepo;
	
	public void postMenu(Menu menu) {
		menuRepo.save(menu);
	}

	public List<Menu> getAllMenu() {
		// TODO Auto-generated method stub
		List<Menu> optional = menuRepo.findAll();
		return optional;
	}
	
	public Optional<Menu> getById(int id) {
		Optional<Menu> optional = menuRepo.findById(id);
		return optional;
	}
	
	public void deleteMenuById(int id) {
		menuRepo.deleteById(id);
	}
}
