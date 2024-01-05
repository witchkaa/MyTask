package com.witchkaa.mytask.controller;

import com.witchkaa.mytask.entity.Task;
import com.witchkaa.mytask.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@AllArgsConstructor
@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private TaskService service;
    @GetMapping(value =  "/")
    public Iterable<Task> getTasks() {
        return this.service.getTasks();
    }
}
