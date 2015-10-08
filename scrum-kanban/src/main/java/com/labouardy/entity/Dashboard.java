package com.labouardy.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Dashboard {

	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	private String description;

	@ManyToMany(mappedBy="dashboards")
	private List<User> users;
	
	@OneToMany(targetEntity=TaskState.class,mappedBy="dashboard")
	private List<TaskState> task_states;
	
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
