package com.pawar.todo.dto;

import java.util.Set;

public class UserRolesDto {
    private Long userId;
    private Integer roleId;

    // Constructors, getters, and setters
    public UserRolesDto() {
    }

    public UserRolesDto(Long userId, Integer roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getroleId() {
		return roleId;
	}

	public void setroleId(Integer roleId) {
		this.roleId = roleId;
	}

    
}