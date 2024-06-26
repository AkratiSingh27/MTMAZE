package com.MTMAZE.MTMAZE.controller;
import com.MTMAZE.MTMAZE.entity.Task;
import com.MTMAZE.MTMAZE.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/home3")
public class TaskController {
        @Autowired
        private TaskService taskService;

        @PostMapping("/addTask")
        public Task addTask(@RequestBody Task task) {
            return taskService.saveTask(task);
        }

        @GetMapping("/task")
        public List<Task> getAllTask() {
            return taskService.getAllTask();
        }

        @GetMapping("/Task/{id}")
        public Task findTaskById(@PathVariable int id) {
            return taskService.getTaskById(id);
        }
        @PutMapping("/updateTask")
        public Task updateTask(@RequestBody Task task) {
            return taskService.updateTask(task);
        }

        @DeleteMapping("/delete/{id}")
        public String deleteTask(@PathVariable int id) {
            return taskService.deleteTask(id);
        }
    }
