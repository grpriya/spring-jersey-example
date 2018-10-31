package com.example.server.repository;

import java.util.List;

import com.example.server.model.Employee;

public interface EmployeeRepository {

    public List<Employee> getAllEmployees();

    public Employee getEmployee(String id);

    public void updateEmployee(Employee employee, String id);

    public void deleteEmployee(String id);

    public void addEmployee(Employee employee);
}
