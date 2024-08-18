package ru.neiropulse.api.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import ru.neiropulse.api.DTOs.Category.CategoryDto;
import ru.neiropulse.api.Services.CategoryService;

@RestController
@RequestMapping("api/v1/category")
public class CategoryController {

    private CategoryService service;

    @PostMapping("/create")
    public ResponseEntity<CategoryDto> create(@Valid @RequestBody CategoryDto categoryDto) {
        CategoryDto createdCategory = service.createCategory(categoryDto);
        return new ResponseEntity<>(createdCategory, HttpStatus.CREATED);
    }

}
