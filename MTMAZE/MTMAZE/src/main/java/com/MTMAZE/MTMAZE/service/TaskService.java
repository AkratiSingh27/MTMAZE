package com.MTMAZE.MTMAZE.service;
import com.MTMAZE.MTMAZE.entity.Task;
import com.MTMAZE.MTMAZE.respository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskService {

        @Autowired
        private TaskRepository taskRepository;

        public Task saveTask(Task task) {
            return taskRepository.save(task); // Use instance instead of class name
        }

        public List<Task> getAllTask() {
            return taskRepository.findAll(); // Use instance instead of class name
        }

        public Task getTaskById(int id) {
            return taskRepository.findById(id).orElse(null); // Use instance instead of class name
        }

        public String deleteTask(int id) {
            taskRepository.deleteById(id); // Use instance instead of class name
            return "Task Removed!! " + id;

        }

        public Task updateTask(Task task) {
            Task existingTask = taskRepository.findById(task.getId()).orElse(null); // Use instance instead of class name
            if (existingTask != null) {
                existingTask.setProject_id(task.getProject_id());
                existingTask.setTask_name(task.getTask_name());
                existingTask.setAssigned_to_id(task.getAssigned_to_id());
                existingTask.setEta_date(task.getEta_date());
                existingTask.setNotes(task.getNotes());
                existingTask.setCreated_by(task.getCreated_by());
                existingTask.setUpdated_by(task.getUpdated_by());
                existingTask.setCreation_date(task.getCreation_date());
                existingTask.setUpdation_date(task.getUpdation_date());
                existingTask.setDeleted(task.isDeleted());
                return taskRepository.save(existingTask);
                // Use instance instead of class name
            }
            return null; // Handle the case where the project is not found
        }
    }
