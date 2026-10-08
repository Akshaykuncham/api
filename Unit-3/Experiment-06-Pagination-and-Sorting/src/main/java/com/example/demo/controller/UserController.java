package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository repo;
    public UserController(UserRepository repo){this.repo=repo;}

    @GetMapping
    public Page<User> getUsers(
        @RequestParam(defaultValue="0") int page,
        @RequestParam(defaultValue="5") int size,
        @RequestParam(defaultValue="name") String sortBy,
        @RequestParam(defaultValue="asc") String direction) {

        Sort sort = direction.equalsIgnoreCase("desc")
                ? Sort.by(sortBy).descending()
                : Sort.by(sortBy).ascending();

        Pageable pageable = PageRequest.of(page, size, sort);
        return repo.findAll(pageable);
    }
}
