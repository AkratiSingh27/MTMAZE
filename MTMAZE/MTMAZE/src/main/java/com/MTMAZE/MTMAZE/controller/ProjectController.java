package com.MTMAZE.MTMAZE.controller;


import com.MTMAZE.MTMAZE.entity.Project;
import com.MTMAZE.MTMAZE.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/page")
public class ProjectController {
    @Autowired
    private ProjectService ProjectService;

    @PostMapping("/addProject")
    public Project addProject(@RequestBody Project project) {
        return ProjectService.saveProject(project);
    }

    @GetMapping("/project")
    public List<Project> getAllProject() {
        return ProjectService.getAllProject();
    }

    @GetMapping("/Project/{id}")
    public Project findProjectById(@PathVariable int id) {
        return ProjectService.getProjectById(id);
    }

    @GetMapping("/Project/{name}")
    public Project findProjectByName(@PathVariable String name) {
        return ProjectService.getProjectByName(name);
    }

    @PutMapping("/updateProject")
    public Project updateProject(@RequestBody Project project) {
        return ProjectService.updateProject(project);
    }

    @DeleteMapping("/delete/{Project_id}")
    public String deleteProject(@PathVariable int id) {
        return ProjectService.deleteProject(id);
    }
}


