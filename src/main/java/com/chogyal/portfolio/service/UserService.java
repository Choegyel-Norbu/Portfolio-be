package com.chogyal.portfolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.chogyal.portfolio.dto.UserDTO;
import com.chogyal.portfolio.model.User;


@Component
public interface UserService {

	public UserDTO register(UserDTO userDTO);
	public List<User> getAllUsers();
	public User getById(Long id);
	public String deleteUser(Long id);
	public Optional<User> updateUser(Long id, User updateUser);
	public UserDTO addRole(String email, List<String> roleNames);
	
	public User verifyGoogleToken(String toTokenString);
	
}
	