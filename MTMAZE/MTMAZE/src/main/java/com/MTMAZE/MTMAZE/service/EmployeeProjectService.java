package com.MTMAZE.MTMAZE.service;

import com.MTMAZE.MTMAZE.entity.EmployeeProject;
import com.MTMAZE.MTMAZE.respository.EmployeeProjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeProjectService {
    @Autowired
        private EmployeeProjectRepository EmployeeProjectRepository;

        public EmployeeProject saveEmployeeProject(EmployeeProject employee_project) {
            return EmployeeProjectRepository.save(employee_project);
        }

        public List<EmployeeProject> getAllEmployeesProject() {
            return EmployeeProjectRepository.findAll();
        }

        public EmployeeProject getEmployeeProjectById(int id) {
            return EmployeeProjectRepository.findById(id).orElse(null);
        }

        public String deleteEmployeeProject(int id) {
            EmployeeProjectRepository.deleteById(id); // Corrected this line
            return "EmployeeProject Removed!! " + id;
        }

    public EmployeeProject updateEmployeeProject(EmployeeProject employee_project){
                EmployeeProject existingEmployeeProject = EmployeeProjectRepository.findById(employee_project.getId()).orElse(null);
                    existingEmployeeProject.setProject_id(employee_project.getProject_id());
                    existingEmployeeProject.setEmp_id(employee_project.getEmp_id());
                    existingEmployeeProject.setCreated_by(employee_project.getCreated_by());
                    existingEmployeeProject.setUpdated_by(employee_project.getUpdated_by());
                    existingEmployeeProject.setCreation_date(employee_project.getCreation_date());
                    existingEmployeeProject.setUpdation_date(employee_project.getUpdation_date());
                    existingEmployeeProject.setDeleted(employee_project.isDeleted());
                    return EmployeeProjectRepository.save(existingEmployeeProject); // Use instance instead of class name
                }
            }
