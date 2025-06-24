package com.chogyal.portfolio.wrapper;

import com.chogyal.portfolio.dto.UserDTO;
import com.chogyal.portfolio.model.User;

public class UserWrapper {

	public static User toEntity(UserDTO userDTO) {
		User user = new User();
		user.setEmail(userDTO.getEmail());
		return user;
	}

	public static UserDTO toDTO(User user) {
		return new UserDTO(user.getId(), user.getEmail(), user.getPassword());
	}

}
