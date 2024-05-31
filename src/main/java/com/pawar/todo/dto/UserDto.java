package com.pawar.todo.dto;

import java.sql.Date;
import java.util.Set;


public class UserDto {
	
	private Long userId;
	private String username;
    private String email;
    private String passwordHash;
    private Boolean loggedIn;
	private Date createdAt;
	private Date updatedAt;

    private Set<RoleDto> roles;
    
    public UserDto() {
	}
    
    public UserDto( String username, String email, String passwordHash) {
    	this.username = username;
		this.email = email;
		this.passwordHash = passwordHash;
	}
    
    public UserDto( String username, String email, String passwordHash,Boolean loggedIn) {
    	this.username = username;
		this.email = email;
		this.passwordHash = passwordHash;
		this.loggedIn = loggedIn;
	}
    
	public UserDto(Long userId,String username, String email, String passwordHash,Boolean loggedIn,Set<RoleDto> set) {
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.passwordHash = passwordHash;
		this.loggedIn = loggedIn;
		this.roles = set;
	}
	
	
	
	public UserDto(Long userId, String username, String email, String passwordHash, Boolean loggedIn, Date createdAt,
			Date updatedAt, Set<RoleDto> roles) {
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.passwordHash = passwordHash;
		this.loggedIn = loggedIn;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.roles = roles;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getpasswordHash() {
		return passwordHash;
	}
	public void setpasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	public Boolean getLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(Boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	public Set<RoleDto> getRoles() {
		return roles;
	}
	public void setRoles(Set<RoleDto> roles) {
		this.roles = roles;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", username=" + username + ", email=" + email + ", passwordHash="
				+ passwordHash + ", loggedIn=" + loggedIn + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", roles=" + roles + "]";
	}		
}
