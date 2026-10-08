package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int id = 250101;
    private String name = "Aditya Software Engineer";
    private String department = "AI & ML Development";

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Dept=" + department + "]";
    }
}
