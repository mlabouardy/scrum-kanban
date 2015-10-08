package com.labouardy.service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labouardy.entity.Task;

@Service
@Transactional
public class InitDbService {

	@Autowired
	private TaskService taskService;
	
	@PostConstruct
	public void init(){
		Task task=new Task();
		task.setName("View");
		task.setBudget(4);
		task.setLeft_to_do(2);
		task.setConsumed_time(1);
		taskService.save(task);
		
		Task task2=new Task();
		task2.setName("Controller");
		task2.setBudget(7);
		task2.setLeft_to_do(3);
		task2.setConsumed_time(4);
		taskService.save(task2);
		
	}
}
