package com.witchkaa.mytask.repo;

import com.witchkaa.mytask.entity.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
