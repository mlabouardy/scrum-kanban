package com.labouardy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.labouardy.entity.Task;


public interface TaskRepository extends JpaRepository<Task, Integer>{
	
	
}
