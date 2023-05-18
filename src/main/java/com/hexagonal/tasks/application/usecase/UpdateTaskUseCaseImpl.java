package com.hexagonal.tasks.application.usecase;

import com.hexagonal.tasks.domain.models.Task;
import com.hexagonal.tasks.domain.ports.input.UpdateTaskUseCase;
import com.hexagonal.tasks.domain.ports.output.TaskRepositoryPort;

import java.util.Optional;

public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public UpdateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> UpdateTask(Long id, Task updateTask) {
        return taskRepositoryPort.update(updateTask);
    }

}
