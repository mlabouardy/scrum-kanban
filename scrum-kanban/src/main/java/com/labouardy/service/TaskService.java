package com.labouardy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labouardy.entity.Task;
import com.labouardy.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;
	
	public void save(Task task){
		taskRepository.save(task);
	}
	
	public Task findById(int id){
		return taskRepository.findOne(id);
	}
}
