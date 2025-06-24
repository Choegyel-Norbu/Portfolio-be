package com.chogyal.portfolio.dto;

import com.chogyal.portfolio.util.UserRole;

public class UserResponseDTO {

	private Long id;
	private String email;
	private UserRole role;
	private String name;
	private boolean registerFlag;
	private String pictureURL;
	private boolean detailSet;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isRegisterFlag() {
		return registerFlag;
	}

	public void setRegisterFlag(boolean registerFlag) {
		this.registerFlag = registerFlag;
	}

	public boolean isDetailSet() {
		return detailSet;
	}

	public void setDetailSet(boolean detailSet) {
		this.detailSet = detailSet;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPictureURL() {
		return pictureURL;
	}

	public void setPictureURL(String pictureURL) {
		this.pictureURL = pictureURL;
	}

}
