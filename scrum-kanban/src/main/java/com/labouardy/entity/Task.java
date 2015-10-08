package com.labouardy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
	private TaskState task_state;

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

	public TaskState getTask_state() {
		return task_state;
	}

	public void setTask_state(TaskState task_state) {
		this.task_state = task_state;
	}
	
	
}
