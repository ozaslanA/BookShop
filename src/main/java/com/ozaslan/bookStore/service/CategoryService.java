package com.ozaslan.bookStore.service;

import com.ozaslan.bookStore.model.Category;
import com.ozaslan.bookStore.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;



    }

