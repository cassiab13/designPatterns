package com.estudos.course.services;

import com.estudos.course.entities.Order;
import com.estudos.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) throws Exception {
        if (repository.findById(id).isPresent()) {
            return repository.findById(id).get();
        }
        throw new Exception("Id not found");
    }
}