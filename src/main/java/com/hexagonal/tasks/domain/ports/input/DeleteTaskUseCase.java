package com.hexagonal.tasks.domain.ports.input;

public interface DeleteTaskUseCase {
    boolean deleteTask(Long id);
}
