package com.MTMAZE.MTMAZE.controller;

import com.MTMAZE.MTMAZE.Dto.UserEmployeeDto;
import com.MTMAZE.MTMAZE.entity.Employee;
import com.MTMAZE.MTMAZE.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/RequestEmployee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody UserEmployeeDto employee) {
        return employeeService.saveEmployee(employee);
    }
    @GetMapping("/employee")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/Employee/{id}")
    public Employee findEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }


    @PutMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return employeeService.deleteEmployee(id);
    }
}

