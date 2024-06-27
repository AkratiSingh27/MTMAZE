package com.MTMAZE.MTMAZE.controller;
import com.MTMAZE.MTMAZE.entity.EmployeeProject;
import com.MTMAZE.MTMAZE.service.EmployeeProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/RequestEmployeeProject")
public class EmployeeProjectController {
    @Autowired
    private EmployeeProjectService EmployeeProjectService;

    @PostMapping("/addEmployeeProject")
    public EmployeeProject addEmployeeProject(@RequestBody EmployeeProject employee_project) {
        return EmployeeProjectService.saveEmployeeProject(employee_project);
    }



    @GetMapping("/employeeProject")
    public List<EmployeeProject> getAllEmployeesProject() {
        return EmployeeProjectService.getAllEmployeesProject();
    }

    @GetMapping("/EmployeeProject/{id}")
    public EmployeeProject findEmployeeProjectById(@PathVariable int id) {
        return EmployeeProjectService.getEmployeeProjectById(id);
    }

    @PutMapping("/updateEmployeeProject")
    public EmployeeProject updateEmployeeProject(@RequestBody EmployeeProject employee_project) {
        return EmployeeProjectService.updateEmployeeProject(employee_project);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployeeProject(@PathVariable int id) {
        return EmployeeProjectService.deleteEmployeeProject(id);
    }
}

