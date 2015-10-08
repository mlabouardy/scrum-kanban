package com.labouardy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labouardy.entity.TaskState;
import com.labouardy.repository.TaskStateRepository;

@Service
public class TaskStateService {

	@Autowired
	private TaskStateRepository taskStateRepository;
	
	public void save(TaskState taskState) {
		taskStateRepository.save(taskState);
	}

}
