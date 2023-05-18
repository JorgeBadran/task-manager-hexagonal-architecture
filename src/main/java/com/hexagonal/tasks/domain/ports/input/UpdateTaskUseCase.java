package com.hexagonal.tasks.domain.ports.input;

import com.hexagonal.tasks.domain.models.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task> UpdateTask(Long id, Task updateTask);
}
