package com.labouardy.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class TaskState {

	@Id
	@GeneratedValue
	private int id;
	
	private int name;
	
	@OneToMany(targetEntity=Task.class,mappedBy="task_state")
	private List<Task> tasks;
	
	@ManyToOne
	private Dashboard dashboard;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}
	
}
