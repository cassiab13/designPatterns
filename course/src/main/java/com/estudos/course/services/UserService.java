package com.estudos.course.services;

import com.estudos.course.entities.User;
import com.estudos.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) throws Exception {
        if (repository.findById(id).isPresent()) {
            return repository.findById(id).get();
        }
        throw new Exception("Id not found");
    }
}