package com.project.reservation.dto;
 
import com.project.reservation.model.User;
 
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
	private String id;
 
	private String password;
 
	private String name;
 
	public User toEntity() {
		return User.builder().id(id).password(password).name(name).build();
	}
}