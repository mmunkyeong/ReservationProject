package com.project.reservation.service;
 
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
 
import com.project.reservation.dao.UserRepository;
import com.project.reservation.dto.UserDTO;
 
import lombok.RequiredArgsConstructor;
 
@Service
@RequiredArgsConstructor
public class UserService {
 
	private final UserRepository userRepository;
 
	private final BCryptPasswordEncoder bCryptPasswordEncoder;
 
	public void insert(UserDTO userDto) {
		userDto.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
		userRepository.save(userDto.toEntity());
	}
}