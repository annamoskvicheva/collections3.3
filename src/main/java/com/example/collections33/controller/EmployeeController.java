package com.example.collections33.controller;

import com.example.collections33.model.Employee;
import com.example.collections33.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }
    @GetMapping("/add")
    public Employee addEmployee(@RequestParam String firstName, @RequestParam String lastName){
        return service.add (firstName, lastName);
    }
    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam String firstName, @RequestParam String lastName){
        return service.remove (firstName, lastName);
    }
    @GetMapping("/dind")
    public Employee findEmployee(@RequestParam String firstName, @RequestParam String lastName){
        return service.find (firstName, lastName);
    }
    @GetMapping
    public Collection<Employee> findAll(){
        return service.findAll();
    }
}
