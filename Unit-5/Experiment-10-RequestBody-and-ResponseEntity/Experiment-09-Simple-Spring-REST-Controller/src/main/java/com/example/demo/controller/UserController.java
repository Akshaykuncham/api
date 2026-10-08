package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final Map<Long,User> users = new HashMap<>();

    @GetMapping public Collection<User> getAll(){return users.values();}
    @PostMapping public User add(@RequestBody User u){users.put(u.getId(),u);return u;}
    @GetMapping("/{id}") public User get(@PathVariable Long id){return users.get(id);}
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id){users.remove(id);}
}
