package com.ecommerce.service;

import com.ecommerce.entity.Category;

import java.util.List;


public interface CategoryService {
    public List <Category> listCategory();
    public boolean hasCategory(long id);
    public void createCategory(Category category);
    public void updateCategory(long id, Category category);
    public void deleteCategory(Long id);
}
