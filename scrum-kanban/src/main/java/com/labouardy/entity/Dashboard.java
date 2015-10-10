package com.labouardy.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Dashboard {

	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	private String description;

	@JsonIgnore
	@ManyToMany(mappedBy="dashboards")
	private List<User> users;
	
	@JsonIgnore
	@OneToMany(targetEntity=TaskState.class,mappedBy="dashboard")
	private List<TaskState> task_states;
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<TaskState> getTask_states() {
		return task_states;
	}

	public void setTask_states(List<TaskState> task_states) {
		this.task_states = task_states;
	}

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
