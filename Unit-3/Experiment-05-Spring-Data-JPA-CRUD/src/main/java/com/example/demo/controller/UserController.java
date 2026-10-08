package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository repo;
    public UserController(UserRepository repo) { this.repo = repo; }

    @GetMapping public List<User> all() { return repo.findAll(); }
    @PostMapping public User create(@RequestBody User user) { return repo.save(user); }
    @GetMapping("/{id}") public User get(@PathVariable Long id) { return repo.findById(id).orElseThrow(); }
    @PutMapping("/{id}") public User update(@PathVariable Long id, @RequestBody User u) {
        User old = repo.findById(id).orElseThrow();
        old.setName(u.getName()); old.setEmail(u.getEmail());
        return repo.save(old);
    }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { repo.deleteById(id); }
}
