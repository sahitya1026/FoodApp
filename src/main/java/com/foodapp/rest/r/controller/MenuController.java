package com.foodapp.rest.r.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodapp.rest.r.model.Category;
import com.foodapp.rest.r.model.Menu;
import com.foodapp.rest.r.repo.MenuRepo;
import com.foodapp.rest.r.service.MenuService;

@RestController
@RequestMapping("/api/menu")
public class MenuController {
	
	@Autowired
	private MenuService menuService;
	
	@PostMapping("/add")
	public ResponseEntity<String> postItem(@RequestBody Menu menu) {
		menuService.postMenu(menu);
		return ResponseEntity.status(HttpStatus.OK).body("Category added in menu added...");
	}
	
	@GetMapping("/allmenu")
	public List<Menu> getAllMenu() {
		return menuService.getAllMenu();
	}
	
	//getMenuById api
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteMenuById(@PathVariable("id") int id) {
		menuService.deleteMenuById(id);
		return ResponseEntity.status(HttpStatus.OK).body("Menu deleted by ID");
	}
	
}
