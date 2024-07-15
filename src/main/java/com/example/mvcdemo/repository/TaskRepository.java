package com.example.mvcdemo.repository;

import com.example.mvcdemo.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
