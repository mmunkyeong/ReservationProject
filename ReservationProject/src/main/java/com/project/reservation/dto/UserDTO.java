package com.project.reservation.dto;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Alias("User")
@Getter
@Setter
@ToString
public class UserDTO {
	String id;
	String password;
	String name;
	String gender;
	
	
	
	public UserDTO() {}

	public UserDTO(String id, String password, String name, String gender) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.gender = gender;
	}

	public UserDTO(String name) {
		super();
		this.name = name;
	}
}