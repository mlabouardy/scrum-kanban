package com.labouardy.service;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labouardy.entity.Dashboard;
import com.labouardy.entity.User;
import com.labouardy.repository.DashboardRepository;

@Service
public class DashboardService {

	@Autowired
	private DashboardRepository dashboardRepository;
	
	public void save(Dashboard db) {
		dashboardRepository.save(db);
	}

	public List<Dashboard> findAll() {
		return dashboardRepository.findAll();
	}

	public List<Dashboard> findByUserId(int id_user) {
		List<Dashboard> l=new ArrayList<Dashboard>();
		for(Dashboard d:findAll()){
			if(hasUser(d, id_user))
				l.add(d);
		}
		return l;
	}
	
	public boolean hasUser(Dashboard d,int id_user){
		for(User user:d.getUsers()){
			if(user.getId()==id_user)
				return true;
		}
		return false;
	}
	
	

}
