package com.labouardy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Task {
	@Id
	@GeneratedValue
	private int id ;
	
	private String name;
	
	private double budget;
	
	private double consumed_time;
	
	private double left_to_do;
	
	@ManyToOne
	private TaskState taskState;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public TaskState getTaskState() {
		return taskState;
	}

	public void setTaskState(TaskState taskState) {
		this.taskState = taskState;
	}

	public double getConsumed_time() {
		return consumed_time;
	}

	public void setConsumed_time(double consumed_time) {
		this.consumed_time = consumed_time;
	}

	public double getLeft_to_do() {
		return left_to_do;
	}

	public void setLeft_to_do(double left_to_do) {
		this.left_to_do = left_to_do;
	}
	
	
}
