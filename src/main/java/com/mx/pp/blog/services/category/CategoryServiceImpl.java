package com.mx.pp.blog.services.category;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.pp.blog.models.category.CategoryModel;
import com.mx.pp.blog.repository.category.CategoryRepository;
import com.mx.pp.blog.services.category.dto.CategoryDTO;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void deleteCategory(Long id) {
		@SuppressWarnings("deprecation")
		CategoryModel category = categoryRepository.getById(id);
		categoryRepository.delete(category);
	}

	@Override
	public List<CategoryModel> getAllCategories() {
		return categoryRepository.findAll();
	}

	@Override
	public Optional<CategoryModel> getOneCategory(Long id) {
		return categoryRepository.findById(id);
	}

	@Override
	public CategoryModel newCategory(CategoryDTO categoryDTO) {

		CategoryModel categoryModel = new CategoryModel();
		categoryModel.setColor(categoryDTO.getColor());
		categoryModel.setDescription(categoryDTO.getDescription());
		categoryModel.setLabel(categoryDTO.getLabel());
		categoryModel.setName(categoryDTO.getName());
		categoryModel.setValue(categoryDTO.getValue());
		categoryModel.setDate(LocalDateTime.now());

		return categoryRepository.save(categoryModel);
	}

	@Override
	public CategoryModel updateCategory(Long id, CategoryDTO categoryDTO) {

		@SuppressWarnings("deprecation")
		CategoryModel categoryModel = categoryRepository.getById(id);
		categoryModel.setColor(categoryDTO.getColor());
		categoryModel.setDescription(categoryDTO.getDescription());
		categoryModel.setLabel(categoryDTO.getLabel());
		categoryModel.setName(categoryDTO.getName());
		categoryModel.setValue(categoryDTO.getValue());

		return categoryRepository.save(categoryModel);
	}

}
