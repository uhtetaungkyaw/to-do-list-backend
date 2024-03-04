package com.demo.todolist.service.impl;

import com.demo.todolist.entity.Category;
import com.demo.todolist.repo.CategoryRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.todolist.dto.NewCategoryRequest;
import com.demo.todolist.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public Category saveNewCategory(NewCategoryRequest request) {
//        Category category = new Category();
//        category.setName(request.getName());
//        category.setImageUrl(request.getImageUrl());
//         Category category = Category.builder()
//                  .name(request.getName())
//                        .imageUrl(request.getImageUrl())
//                            .build();

         Category category1 = mapper.map(request, Category.class);

       return categoryRepo.save(category1);
    }
}
