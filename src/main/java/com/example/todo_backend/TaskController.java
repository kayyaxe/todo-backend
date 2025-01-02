package com.example.todo_backend;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    // POST request to add a new task
    @PostMapping
    public Task addTask(@RequestBody Task newTask) {
        System.out.println(newTask);
        return taskService.saveTask(newTask);
    }
}

