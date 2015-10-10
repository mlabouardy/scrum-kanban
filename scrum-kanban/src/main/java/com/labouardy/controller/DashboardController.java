package com.labouardy.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.labouardy.entity.Dashboard;
import com.labouardy.entity.TaskState;
import com.labouardy.repository.UserRepository;
import com.labouardy.service.DashboardService;
import com.labouardy.service.UserService;

@RestController
public class DashboardController {

	@Autowired
	private DashboardService dashboardService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/dashboards.json",method=RequestMethod.GET)
	public List<Dashboard> getDashboards(){
		return dashboardService.findAll();
	}
	
	@RequestMapping(value="/api/dashboards.json",method=RequestMethod.GET)
	public List<Dashboard> getUserDashboards(Principal principal){
		String username=principal.getName();
		return userService.findDashBoardsByUsername(username);
	}
	
	@RequestMapping(value="/api/dashboards/{id}.json",method=RequestMethod.GET)
	public Dashboard getUserDashboardInformation(Principal principal, @PathVariable int id){
		String username=principal.getName();
		return userService.findDashBoardById(username, id);
	}
}
