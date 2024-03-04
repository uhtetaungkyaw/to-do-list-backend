package com.demo.todolist.service;

import com.demo.todolist.dto.NewCategoryRequest;
import com.demo.todolist.entity.Category;

public interface CategoryService {

    Category saveNewCategory(NewCategoryRequest request);

}
