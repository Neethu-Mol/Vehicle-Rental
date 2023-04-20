package com.vehicleRental.vehicleRental.RequestBody;

import java.time.LocalDateTime;

public class VehicleDTO {

	private long id;

	private String vehicleName;

	private String vehicleNumber;

	private String vehicleModel;

	private int vehicleRentAmount;

	private boolean status;
	
	private int createdBy;

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	private LocalDateTime createdAt;

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

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public int getVehicleRentAmount() {
		return vehicleRentAmount;
	}

	public void setVehicleRentAmount(int vehicleRentAmount) {
		this.vehicleRentAmount = vehicleRentAmount;
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
