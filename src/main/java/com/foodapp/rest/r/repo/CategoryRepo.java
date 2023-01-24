package com.foodapp.rest.r.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodapp.rest.r.model.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
