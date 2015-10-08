package com.labouardy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.labouardy.entity.TaskState;

public interface TaskStateRepository extends JpaRepository<TaskState, Integer> {

}
