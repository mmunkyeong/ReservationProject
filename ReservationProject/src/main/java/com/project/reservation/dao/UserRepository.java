package com.project.reservation.dao;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.reservation.model.User;
 
public interface UserRepository extends JpaRepository<User, String> {
	User findOneById(String id);
}