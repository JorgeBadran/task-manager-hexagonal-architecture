package com.hexagonal.tasks.infrastuture.repository;

import com.hexagonal.tasks.infrastuture.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTaskRepository extends JpaRepository<TaskEntity, Long> {
}
