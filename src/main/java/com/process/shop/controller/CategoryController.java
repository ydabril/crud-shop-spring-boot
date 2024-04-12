package com.process.shop.controller;

import com.process.shop.model.Category;
import com.process.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @PostMapping
    public Category createCategory(@RequestBody Category category){
        return categoryService.createCategory(category);
    }
    @PutMapping("/{id}")
    public Category updateCategory(@RequestBody Category category, @PathVariable Long id){
        category.setId(id);
        return categoryService.updateCategory(category, id);
    }
    @GetMapping
    public List<Category> allCategory(){
        return categoryService.findAllCategory();
    }
}
