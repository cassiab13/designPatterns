package com.estudos.course.controllers;

import com.estudos.course.entities.Category;
import com.estudos.course.entities.Order;
import com.estudos.course.services.CategoryService;
import com.estudos.course.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        try {
            Category obj = service.findById(id);
            return ResponseEntity.ok().body(obj);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
