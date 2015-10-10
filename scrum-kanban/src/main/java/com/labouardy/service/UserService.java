package com.labouardy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labouardy.entity.Dashboard;
import com.labouardy.entity.User;
import com.labouardy.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public void save(User user) {
		userRepository.save(user);
	}

	public int findUserIdByName(String name) {
		User user=userRepository.findByUsername(name);
		return user.getId();
	}

	public List<Dashboard> findDashBoardsByUsername(String username) {
		User user=userRepository.findByUsername(username);
		return user.getDashboards();
	}

	public Dashboard findDashBoardById(String username,int id) {
		Dashboard d=null;
		for(Dashboard t:findDashBoardsByUsername(username)){
			if(t.getId()==id)
				d=t;
		}
		return d;
	}

}
