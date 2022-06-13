package com.perscholas.employeemngr.service;

import com.perscholas.employeemngr.model.Employee;
import com.perscholas.employeemngr.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
