package com.ecommerce.service.impl;

import com.ecommerce.entity.Category;
import com.ecommerce.repository.CategoryRepository;
import com.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> listCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public boolean hasCategory(long id) {
        return categoryRepository.findById(id).isPresent();
    }

    @Override
    public void createCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void updateCategory(long id, Category categoryUpdate) {
        Category category = categoryRepository.findById(id).get();
        category.setCategoryName(categoryUpdate.getCategoryName());
        category.setImageUrl(categoryUpdate.getImageUrl());
        categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
