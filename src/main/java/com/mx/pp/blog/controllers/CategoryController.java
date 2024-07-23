package com.mx.pp.blog.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.pp.blog.models.category.CategoryModel;
import com.mx.pp.blog.services.category.CategoryService;
import com.mx.pp.blog.services.category.dto.CategoryDTO;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	/**
	 * Delete a category
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCategory(@PathVariable(name = "id") Long id) {
		categoryService.deleteCategory(id);
		return ResponseEntity.ok("Category with ID " + id + " deleted successfully");
	}

	/**
	 * Get all categories
	 * 
	 * @return
	 */
	@GetMapping
	public ResponseEntity<Map<String, List<CategoryModel>>> getAllCategories() {
		List<CategoryModel> users = categoryService.getAllCategories();

		Map<String, List<CategoryModel>> response = new HashMap<>();
		response.put("category", users);

		return ResponseEntity.ok(response);
	}

	/**
	 * Get one category
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public ResponseEntity<CategoryModel> getOneCategory(@PathVariable(name = "id") Long id) {

		Optional<CategoryModel> categoryOptional = categoryService.getOneCategory(id);

		if (categoryOptional.isPresent()) {
			return ResponseEntity.ok(categoryOptional.get());
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	/**
	 * Create a new Category
	 * 
	 * @param category
	 * @return
	 */
	@PostMapping
	public ResponseEntity<CategoryModel> saveCategory(@RequestBody CategoryDTO category) {
		return new ResponseEntity<>(categoryService.newCategory(category), HttpStatus.CREATED);
	}

	/**
	 * Update User Image
	 * 
	 * @param id
	 * @param user
	 * @return
	 */
	@PutMapping("/{id}")
	public ResponseEntity<CategoryModel> updateUserImage(@PathVariable(name = "id") Long id,
			@RequestBody CategoryDTO categoryDTO) {

		CategoryModel category = categoryService.updateCategory(id, categoryDTO);
		return ResponseEntity.ok(category);

	}

}
