package ru.neiropulse.api.Mappers.Category;

import ru.neiropulse.api.DTOs.CategoryDto;
import ru.neiropulse.api.Models.Category;

public class CategoryMapper {

    public static Category map2CategoryModel(CategoryDto dto) {
        return new Category(
                dto.getId(),
                dto.getName(),
                dto.getIsHidden());
    }

    public static CategoryDto map2CategoryDto(Category model) {
        return new CategoryDto(
                model.getId(),
                model.getName(),
                model.getIsHidden());
    }

}
