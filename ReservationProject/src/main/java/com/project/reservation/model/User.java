package com.project.reservation.model;
 
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
 
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "user")
public class User {
 
	@Id
	@Column(name = "id")
	private String id;
 
	@Column(name = "password")
	private String password;
 
	@Column(name = "name")
	private String name;
 
	@Builder
	public User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
}