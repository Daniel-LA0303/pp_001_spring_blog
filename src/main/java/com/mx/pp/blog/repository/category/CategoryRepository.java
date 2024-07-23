package com.mx.pp.blog.repository.category;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.pp.blog.models.category.CategoryModel;

public interface CategoryRepository extends JpaRepository<CategoryModel, Long> {

}
