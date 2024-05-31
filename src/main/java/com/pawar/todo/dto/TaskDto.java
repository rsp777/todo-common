package com.pawar.todo.dto;

import java.sql.Date;

public class TaskDto {

	private Long id;
	private String taskName;
	private String userName;
	private boolean completed;
	private Date createdAt;
	private Date dueDate;
	
	public TaskDto() {
	}
	
	public TaskDto(Long id, String taskName,String userName, boolean completed,Date createdAt,Date dueDate) {
		super();
		this.id = id;
		this.taskName = taskName;
		this.userName = userName;
		this.completed = completed;
		this.createdAt = createdAt;
		this.dueDate = dueDate;
	}	

	public TaskDto(Long id, String taskName, boolean completed) {
		this.id = id;
		this.taskName = taskName;
		this.completed = completed;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public boolean isCompleted() {
		return completed;
	}
	
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return "TaskDto [id=" + id + ", taskName=" + taskName + ", userName=" + userName + ", completed=" + completed
				+ ", createdAt=" + createdAt + ", dueDate=" + dueDate + "]";
	}
}