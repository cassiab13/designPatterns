package com.estudos.course.services;

import com.estudos.course.entities.Category;
import com.estudos.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) throws Exception {
        if (repository.findById(id).isPresent()) {
            return repository.findById(id).get();
        }
        throw new Exception("Id not found");
    }
}