package com.demo.todolist.controller;

import com.demo.todolist.domain.HttpResponse;
import com.demo.todolist.dto.NewCategoryRequest;
import com.demo.todolist.entity.Category;
import com.demo.todolist.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("/categories")
    public ResponseEntity<HttpResponse> saveNewCategory(@RequestBody NewCategoryRequest request){
        Category category = categoryService.saveNewCategory(request);
       HttpResponse httpResponse = new HttpResponse(category, HttpStatus.CREATED);
        return new ResponseEntity<>(httpResponse, HttpStatus.CREATED);
    }

}
