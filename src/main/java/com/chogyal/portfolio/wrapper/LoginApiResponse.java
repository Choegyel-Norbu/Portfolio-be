package com.chogyal.portfolio.wrapper;

import com.chogyal.portfolio.dto.UserResponseDTO;

public class LoginApiResponse {

	private String token;
	private UserResponseDTO userResponseDTO;

	public LoginApiResponse() {
		super();
	}

	public LoginApiResponse(String token, UserResponseDTO userResponseDTO) {
		this.token = token;
		this.userResponseDTO = userResponseDTO;
	}

	public String getToken() {
		return token;
	}

	public UserResponseDTO getUserDTO() {
		return userResponseDTO;
	}

}
