package com.labouardy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labouardy.entity.Dashboard;
import com.labouardy.repository.DashboardRepository;

@Service
public class DashboardService {

	@Autowired
	private DashboardRepository dashboardRepository;
	
	public void save(Dashboard db) {
		dashboardRepository.save(db);
	}

}
