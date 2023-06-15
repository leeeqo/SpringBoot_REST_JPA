package com.zt.spring.springboot.datajpa.springboot_data_jpa.dao;

import com.zt.spring.springboot.springboot_rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}