package com.project.reservation.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.project.reservation.dto.UserDTO;

public interface UserDAO {
	public abstract List<UserDTO> userList(SqlSessionTemplate session);
}