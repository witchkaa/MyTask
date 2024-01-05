package com.witchkaa.mytask.service;

import com.witchkaa.mytask.entity.Task;
import com.witchkaa.mytask.repo.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService{
    private TaskRepository repo;
    @Override
    public Iterable<Task> getTasks() {
        return this.repo.findAll();
    }

    @Override
    public Task saveTask(Task task) {
        return repo.save(task);
    }
}
