package com.witchkaa.mytask.service;

import com.witchkaa.mytask.entity.Task;

public interface TaskService {
    Iterable<Task> getTasks();
    Task saveTask(Task task);
}
