package com.ecommerce.controller;

import com.ecommerce.entity.Category;
import com.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/")
    public List<Category> ListCategory(){

        return categoryService.listCategory();
    }
    @PostMapping("/create")
    public String createCategory(@RequestBody Category category){
        categoryService.createCategory(category);
        return "create success";
    }
    @PutMapping("/update/{id}")
    public String updateCategory(@PathVariable ("id") long id, @RequestBody Category category){
        if(!categoryService.hasCategory(id)){
            return "category is not exist";
        }
        categoryService.updateCategory(id,category);
        return "update success";
    }
    @DeleteMapping ("/delete/{id}")
    public String deleteCategory(@PathVariable ("id") long id){
        categoryService.deleteCategory(id);
        return "delete success";
    }
}
