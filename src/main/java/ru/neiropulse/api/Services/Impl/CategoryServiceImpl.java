package ru.neiropulse.api.Services.Impl;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import ru.neiropulse.api.DTOs.CategoryDto;
import ru.neiropulse.api.Mappers.Category.CategoryMapper;
import ru.neiropulse.api.Models.Category;
import ru.neiropulse.api.Repositories.CategoryRepository;
import ru.neiropulse.api.Services.CategoryService;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository repository;

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
        Category category = CategoryMapper.map2CategoryModel(categoryDto);
        Category savedCategory = repository.save(category);
        return CategoryMapper.map2CategoryDto(savedCategory);
    }

}
