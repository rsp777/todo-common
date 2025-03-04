package com.pawar.todo.dto;

import java.time.LocalDateTime;
import java.util.Set;

public class RoleDto {

	private Integer role_id;
	private String name;
	private Set<PermissionDto> permissions;
	private LocalDateTime createdDttm;
	private LocalDateTime lastUpdatedDttm;
	private String createdSource;
	private String lastUpdatedSource;

	public RoleDto() {
		// TODO Auto-generated constructor stub
	}
	
	

	public RoleDto(Integer role_id, String name, Set<PermissionDto> permissions, LocalDateTime createdDttm,
			LocalDateTime lastUpdatedDttm, String createdSource, String lastUpdatedSource) {
		super();
		this.role_id = role_id;
		this.name = name;
		this.permissions = permissions;
		this.createdDttm = createdDttm;
		this.lastUpdatedDttm = lastUpdatedDttm;
		this.createdSource = createdSource;
		this.lastUpdatedSource = lastUpdatedSource;
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

	public Set<PermissionDto> getPermissions() {
		return permissions;
	}

	public void setPermissions(Set<PermissionDto> permissions) {
		this.permissions = permissions;
	}

	public LocalDateTime getCreatedDttm() {
		return createdDttm;
	}

	public void setCreatedDttm(LocalDateTime createdDttm) {
		this.createdDttm = createdDttm;
	}

	public LocalDateTime getLastUpdatedDttm() {
		return lastUpdatedDttm;
	}

	public void setLastUpdatedDttm(LocalDateTime lastUpdatedDttm) {
		this.lastUpdatedDttm = lastUpdatedDttm;
	}

	public String getCreatedSource() {
		return createdSource;
	}

	public void setCreatedSource(String createdSource) {
		this.createdSource = createdSource;
	}

	public String getLastUpdatedSource() {
		return lastUpdatedSource;
	}

	public void setLastUpdatedSource(String lastUpdatedSource) {
		this.lastUpdatedSource = lastUpdatedSource;
	}

	@Override
	public String toString() {
		return "RoleDto [role_id=" + role_id + ", name=" + name + ", permissions=" + permissions + ", createdDttm="
				+ createdDttm + ", lastUpdatedDttm=" + lastUpdatedDttm + ", createdSource=" + createdSource
				+ ", lastUpdatedSource=" + lastUpdatedSource + "]";
	}

}
