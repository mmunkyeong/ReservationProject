package com.project.reservation.service;

import java.util.HashSet;
import java.util.Set;
 
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.project.reservation.dao.UserRepository;
import com.project.reservation.model.*;
 
import lombok.AllArgsConstructor;
 
@Service
@AllArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
 
	private final UserRepository userRepository;
 
	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String id) {
 
		Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
 
		com.project.reservation.model.User user = userRepository.findOneById(id);
 
		System.out.println(user);
		if (user != null) {
			System.out.println("hi");
			grantedAuthorities.add(new SimpleGrantedAuthority("USER")); // USER 라는 역할을 넣어준다.
			return new User(user.getId(), user.getPassword(), grantedAuthorities);
		} else {
			System.out.println("bye");
			throw new UsernameNotFoundException("can not find User : " + id);
		}
	}
	
}