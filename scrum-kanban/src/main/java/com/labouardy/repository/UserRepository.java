package com.labouardy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.labouardy.entity.Dashboard;
import com.labouardy.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUsername(String username);
}
