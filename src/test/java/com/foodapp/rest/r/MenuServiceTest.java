package com.foodapp.rest.r;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodapp.rest.r.model.Category;
import com.foodapp.rest.r.repo.CategoryRepo;
import com.foodapp.rest.r.service.CategoryService;

@SpringBootTest
//@ExtendWith(MockitoExtension.class)
//@MockitoSettings(strictness = Strictness.LENIENT)
public class MenuServiceTest {
	@Autowired
//	@InjectMocks

	private CategoryService categoryService;

//	@Mock

	private CategoryRepo categoryRepo;

	@Test
	public void getMenuByCategoryTest() {
		Category c = new Category();
		c.setCategoryName("Starter");

		Assertions.assertEquals("Starter", categoryService.getById(1).get().getCategoryName());
	}
}
