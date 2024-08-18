package ru.neiropulse.api.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.neiropulse.api.Models.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
