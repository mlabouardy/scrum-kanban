package com.labouardy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.labouardy.entity.Dashboard;

public interface DashboardRepository extends JpaRepository<Dashboard, Integer> {

}
