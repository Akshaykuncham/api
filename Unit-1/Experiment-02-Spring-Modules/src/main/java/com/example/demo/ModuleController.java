package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModuleController {

    @GetMapping("/modules")
    public String modules() {
        return "Core Container, Data Access/Integration and Web modules";
    }
}
