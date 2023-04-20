package com.vehicleRental.vehicleRental.Model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users_table")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private long id;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "user_phone")
	private String phone;
	
	@ManyToOne
	@JoinColumn(name = "role_id", nullable = false)
	private Roles roles;
	
	@Column(name = "user_password")
	private String password;
	
	@Column(name = "user_statue")
	private boolean status;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;

	public long getId() {
		return id;
	}
	
	

	public Roles getRoles() {
		return roles;
	}


	public void setRoles(Roles roles) {
		this.roles = roles;
	}


	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	} 
	
	
	
	

}
