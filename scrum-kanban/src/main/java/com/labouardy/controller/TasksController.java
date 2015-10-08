package com.labouardy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.labouardy.entity.Task;
import com.labouardy.service.TaskService;

@RestController
@RequestMapping("/data")
public class TasksController {

	@Autowired
	private TaskService taskService;
	
	@RequestMapping(value="/task/{id}")
	public Task getTask(@PathVariable int id){
		Task task=taskService.findById(id);
		return task;
	}
}
