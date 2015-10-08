package com.labouardy.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labouardy.entity.Dashboard;
import com.labouardy.entity.Role;
import com.labouardy.entity.Task;
import com.labouardy.entity.TaskState;
import com.labouardy.entity.User;

@Service
@Transactional
public class InitDbService {

	@Autowired
	private TaskService taskService;
	
	@PostConstruct
	public void init(){
		Role admin=new Role();
		admin.setName("Admin");
		
		Role developper=new Role();
		developper.setName("Developper");
		
		User mohamed=new User();
		mohamed.setUsername("Mohamed");
		mohamed.setEmail("mohamed@labouardy.com");
		mohamed.setRole(admin);
		
		User yazid=new User();
		yazid.setUsername("Yazid");
		yazid.setEmail("yazid@labouardy.com");
		yazid.setRole(developper);
		
		User vincent=new User();
		vincent.setUsername("Vincent");
		vincent.setEmail("vincent@labouardy.com");
		vincent.setRole(developper);
		
		
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
		
		
		TaskState list1_db1=new TaskState();
		list1_db1.setName("To do");
		List<Task> t=new ArrayList();
		t.add(task);
		t.add(task2);
		list1_db1.setTasks(t);
		
		TaskState list1_db2=new TaskState();
		list1_db1.setName("To do");
		List<Task> tt=new ArrayList();
		tt.add(task);
		tt.add(task2);
		list1_db2.setTasks(tt);
		
		Dashboard db=new Dashboard();
		db.setName("Scrum Manager");
		db.setDescription("Bla bla bal bla");
		List<User> users=new ArrayList<User>();
		users.add(mohamed);
		users.add(yazid);
		users.add(vincent);
		List<TaskState> l=new ArrayList<TaskState>();
		l.add(list1_db1);
		db.setUsers(users);
		db.setTask_states(l);
		
		Dashboard db2=new Dashboard();
		db2.setName("Forms Drawer");
		db2.setDescription("Bla bla bal bla");
		List<User> users2=new ArrayList<User>();
		users2.add(mohamed);
		users2.add(yazid);
		users2.add(vincent);
		List<TaskState> l2=new ArrayList<TaskState>();
		l2.add(list1_db2);
		db2.setUsers(users2);
		db2.setTask_states(l2);
		
	}
}
