package com.mx.pp.blog.services.category;

import java.util.List;
import java.util.Optional;

import com.mx.pp.blog.models.category.CategoryModel;
import com.mx.pp.blog.services.category.dto.CategoryDTO;

public interface CategoryService {

	public void deleteCategory(Long id);

	public List<CategoryModel> getAllCategories();

	public Optional<CategoryModel> getOneCategory(Long id);

	public CategoryModel newCategory(CategoryDTO categoryDTO);

	public CategoryModel updateCategory(Long id, CategoryDTO categoryDTO);

}
