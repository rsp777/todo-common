package com.pawar.todo.dto;

public class RoleDto {

	private Integer role_id;
	private String name;

	public RoleDto() {
		// TODO Auto-generated constructor stub
	}
	
	public RoleDto(String name) {
		this.name = name;
	}

	public RoleDto(Integer role_id, String name) {
		this.role_id = role_id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRole_id() {
		return role_id;
	}

	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}

	@Override
	public String toString() {
		return "RoleDto [role_id=" + role_id + ", name=" + name + "]";
	}

}
