package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final Map<Long,User> users = new HashMap<>();

    @GetMapping public Collection<User> all(){return users.values();}
    @GetMapping("/{id}") public User get(@PathVariable Long id){return users.get(id);}
    @PostMapping public User create(@RequestBody User u){users.put(u.getId(),u);return u;}
    @PutMapping("/{id}") public User update(@PathVariable Long id,@RequestBody User u){u.setId(id);users.put(id,u);return u;}
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id){users.remove(id);}
}
