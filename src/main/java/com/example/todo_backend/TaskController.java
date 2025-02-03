package com.example.todo_backend;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


@RestController
@CrossOrigin(origins = "https://todo-react-kar.vercel.app/")
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getAllTasks() {
        System.out.println("Fetching all tasks...");
        return taskService.getAllTasks();
    }

    // POST request to add a new task
    @PostMapping
    public Task addTask(@RequestBody Task newTask) {
        System.out.println("Task added: " + newTask);
        return taskService.saveTask(newTask);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        System.out.println("ID of task deleted: " + id);
        taskService.deleteTask(id);
    }

    @PutMapping("/{id}")
    public void editTask(@PathVariable Long id, @RequestBody Task updatedTask) {
        updatedTask.setId(id);
        System.out.println("Task updated: "+ updatedTask);
        taskService.updateTask(updatedTask);

    }
}

