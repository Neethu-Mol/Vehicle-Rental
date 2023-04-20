package com.vehicleRental.vehicleRental.RequestBody;

import java.time.LocalDateTime;

import com.vehicleRental.vehicleRental.Model.User;

public class VehicleStationDTO {

	private long id;

	private String vehicleName;

	private String vehicleStationCode;

	private String vehicleStationCity;

	private boolean status;

	private LocalDateTime createdAt;
	
	private int createdBy;

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	private User user;

	private LocalDateTime updatedAt;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleStationCode() {
		return vehicleStationCode;
	}

	public void setVehicleStationCode(String vehicleStationCode) {
		this.vehicleStationCode = vehicleStationCode;
	}

	public String getVehicleStationCity() {
		return vehicleStationCity;
	}

	public void setVehicleStationCity(String vehicleStationCity) {
		this.vehicleStationCity = vehicleStationCity;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
}
