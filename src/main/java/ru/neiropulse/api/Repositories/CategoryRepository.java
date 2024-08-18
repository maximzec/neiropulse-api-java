package ru.neiropulse.api.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.neiropulse.api.Models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
