package com.example.todo_backend;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/api/tasks")
public class TaskController {

    // POST request to add a new task
    @PostMapping
    public Task addTask(@RequestBody Task newTask) {
        // Logic to save the task (e.g., save to the database)
        // Here we just return the task for simplicity
        System.out.println(newTask);
        return newTask;
    }
}

