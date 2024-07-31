package com.pawar.todo.dto;

import java.sql.Date;
import java.util.Set;

public class UserDto {

	private Long user_id;
	private String username;
	private String email;
	private String passwordHash;
	private String firstName;
	private String middleName;
	private String lastName;
	private Boolean loggedIn;
	private Date createdAt;
	private Date updatedAt;
	private Set<RoleDto> roles;

	public UserDto() {
	}

	public UserDto(String username, String email, String passwordHash) {
		this.username = username;
		this.email = email;
		this.passwordHash = passwordHash;
	}

	public UserDto(String username, String email, String passwordHash, Boolean loggedIn) {
		this.username = username;
		this.email = email;
		this.passwordHash = passwordHash;
		this.loggedIn = loggedIn;
	}

	public UserDto(Long user_id, String username, String email, String passwordHash, String firstName,
			String middleName, String lastName, Boolean loggedIn, Set<RoleDto> roles) {
		this.user_id = user_id;
		this.username = username;
		this.email = email;
		this.passwordHash = passwordHash;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.loggedIn = loggedIn;
		this.roles = roles;
	}

	public UserDto(Long user_id, String username, String email, String passwordHash, String firstName,
			String middleName, String lastName, Boolean loggedIn, Date createdAt, Date updatedAt, Set<RoleDto> roles) {
		this.user_id = user_id;
		this.username = username;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	

	@Override
	public String toString() {
		return "UserDto [user_id=" + user_id + ", username=" + username + ", email=" + email + ", passwordHash="
				+ passwordHash + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", loggedIn=" + loggedIn + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", roles="
				+ roles + "]";
	}

}
