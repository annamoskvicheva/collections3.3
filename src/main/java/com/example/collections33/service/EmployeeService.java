package com.example.collections33.service;

import com.example.collections33.model.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee add (String firstName, String lastName);
    Employee remove (String firstName, String lastName);
    Employee find (String firstName, String lastName);


    Collection<Employee> findAll();
}
