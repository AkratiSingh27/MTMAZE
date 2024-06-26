package com.MTMAZE.MTMAZE.service;

import com.MTMAZE.MTMAZE.entity.Employee;
import com.MTMAZE.MTMAZE.respository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee getEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }
    public String deleteEmployee(int id) {
        employeeRepository.deleteById(id); // Corrected this line
        return "Employee Removed!! " + id;
    }

    public Employee updateEmployee(Employee employee) {
        Employee existingEmployee = employeeRepository.findById(employee.getId()).orElse(null);
            existingEmployee.setName(employee.getName());
            existingEmployee.setDesignationId(employee.getDesignationId());
            existingEmployee.setMobileNo(employee.getMobileNo());
            existingEmployee.setEmail(employee.getEmail());
            existingEmployee.setPassword(employee.getPassword());
            existingEmployee.setAddress(employee.getAddress());
            existingEmployee.setCreatedBy(employee.getCreatedBy());
            existingEmployee.setUpdatedBy(employee.getUpdatedBy());
            existingEmployee.setCreationDate(employee.getCreationDate());
            existingEmployee.setUpdationDate(employee.getUpdationDate());
            existingEmployee.setDeleted(employee.isDeleted());
            return employeeRepository.save(existingEmployee); // Use instance instead of class name
        }

}
