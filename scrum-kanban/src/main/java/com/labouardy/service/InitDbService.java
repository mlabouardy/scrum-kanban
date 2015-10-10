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
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private TaskStateService taskStateService;
	
	@Autowired
	private DashboardService dashboardService;
	
	@PostConstruct
	public void init(){
		Task model=new Task();
		model.setName("Model");
		model.setBudget(4);
		model.setConsumed_time(2);
		model.setLeft_to_do(1);
		taskService.save(model);
		
		Task view=new Task();
		view.setName("View");
		view.setBudget(7);
		view.setConsumed_time(2.5);
		view.setLeft_to_do(3);
		taskService.save(view);
	
		TaskState todo=new TaskState();
		todo.setName("To do");
		taskStateService.save(todo);
		
		TaskState inprogress=new TaskState();
		inprogress.setName("In progress");
		taskStateService.save(inprogress);
		
		TaskState done=new TaskState();
		done.setName("Done");
		taskStateService.save(done);
		
		List<TaskState> lt=new ArrayList<TaskState>();
		lt.add(todo);
		lt.add(inprogress);
		lt.add(done);
		
		
		Dashboard db=new Dashboard();
		db.setName("Scrum Manager");
		db.setDescription("Bla bla bal bla");
		db.setTask_states(lt);
		dashboardService.save(db);
		
		Dashboard db2=new Dashboard();
		db2.setName("Forms Drawer");
		db2.setDescription("Bla bla bal bla");
		db2.setTask_states(lt);
		dashboardService.save(db2);
		
		Role admin=new Role();
		admin.setName("Admin");
		roleService.save(admin);
		
		Role developper=new Role();
		developper.setName("Developper");
		roleService.save(developper);
		
		List<Dashboard> l=new ArrayList<Dashboard>();
		l.add(db);
		l.add(db2);
		
		User mohamed=new User();
		mohamed.setUsername("root");
		mohamed.setEmail("mohamed@labouardy.com");
		mohamed.setPassword("root");
		mohamed.setRole(admin);
		mohamed.setDashboards(l);
		userService.save(mohamed);
		
		User yazid=new User();
		yazid.setUsername("Yazid");
		yazid.setEmail("yazid@labouardy.com");
		yazid.setRole(developper);
		yazid.setDashboards(l);
		userService.save(yazid);
		
		User vincent=new User();
		vincent.setUsername("Vincent");
		vincent.setEmail("vincent@labouardy.com");
		vincent.setRole(developper);
		vincent.setDashboards(l);
		userService.save(vincent);
		
	}
}
