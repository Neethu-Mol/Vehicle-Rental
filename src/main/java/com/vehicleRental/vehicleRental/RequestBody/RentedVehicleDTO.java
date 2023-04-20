package com.vehicleRental.vehicleRental.RequestBody;

import java.time.LocalDateTime;



public class RentedVehicleDTO {

	private long id;
	
	private long userId;
	private long vehicleId;
	
	private long purchasedVehicleStationId;
	private long returnedVehicleStationId;
	
	private boolean rentPaymentStatus;
	
	private boolean status;
	
	private LocalDateTime createdAt;
	
	private LocalDateTime updatedAt;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}


	public long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public long getPurchasedVehicleStationId() {
		return purchasedVehicleStationId;
	}

	public void setPurchasedVehicleStationId(long purchasedVehicleStationId) {
		this.purchasedVehicleStationId = purchasedVehicleStationId;
	}

	public long getReturnedVehicleStationId() {
		return returnedVehicleStationId;
	}

	public void setReturnedVehicleStationId(long returnedVehicleStationId) {
		this.returnedVehicleStationId = returnedVehicleStationId;
	}

	public boolean isRentPaymentStatus() {
		return rentPaymentStatus;
	}

	public void setRentPaymentStatus(boolean rentPaymentStatus) {
		this.rentPaymentStatus = rentPaymentStatus;
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
