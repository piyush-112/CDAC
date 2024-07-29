package com.blogs.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.blogs.entities.Category;

@DataJpaTest
@Rollback(false)
@AutoConfigureTestDatabase(replace = Replace.NONE)
class CategoryRepositoryTest {
	@Autowired
	private CategoryRepository categoryRepository;

	@Test //to tell JUnit frmwork that following is a test method
	void testCategorySave() {
		Category newCat=new Category("category-45", "desc-45");
		Category persistentCat = categoryRepository.save(newCat);
		assertEquals("category-45", persistentCat.getName());
	}
	//add a test case to get list of categories with desc -
	//having a keyword 
	// "desc"
	@Test
	void testFindByDescriptionContaining() {
		List<Category> list = categoryRepository.findByDescriptionContaining("desc");
		list.forEach(System.out::println);//NOT at all recommended !
		assertEquals(7, list.size());
	}
}
