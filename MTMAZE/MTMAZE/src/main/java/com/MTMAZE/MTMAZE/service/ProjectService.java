package com.MTMAZE.MTMAZE.service;
import com.MTMAZE.MTMAZE.entity.Project;
import com.MTMAZE.MTMAZE.respository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveProject(Project project) {
        return projectRepository.save(project); // Use instance instead of class name
    }

    public List<Project> getAllProject() {
        return projectRepository.findAll(); // Use instance instead of class name
    }

    public Project getProjectById(int id) {
        return projectRepository.findById(id).orElse(null); // Use instance instead of class name
    }

    public Project getProjectByName(String name) {
        return projectRepository.findByName(name); // Use instance instead of class name
    }

    public String deleteProject(int id) {
        projectRepository.deleteById(id); // Use instance instead of class name
        return "Project Removed!! " + id;
    }

    public Project updateProject(Project project) {
        Project existingProject = projectRepository.findById(project.getId()).orElse(null); // Use instance instead of class name
        if (existingProject != null) {
            existingProject.setName(project.getName());
            existingProject.setDescription(project.getDescription());
            existingProject.setStarting_date(project.getStarting_date());
            existingProject.setCreated_by(project.getCreated_by());
            existingProject.setUpdated_by(project.getUpdated_by());
            existingProject.setCreation_date(project.getCreation_date());
            existingProject.setUpdation_date(project.getUpdation_date());
            existingProject.setDeleted(project.isDeleted());
            return projectRepository.save(existingProject); // Use instance instead of class name
        }
        return null; // Handle the case where the project is not found
    }
}

