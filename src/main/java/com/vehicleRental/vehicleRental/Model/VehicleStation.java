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
@Table(name = "vehicle_station_table")
public class VehicleStation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vehicle_station_id")
	private long id;
	
	@Column(name = "vehicle_station_name")
	private String vehicleStastionName;
	
	@Column(name = "vehicle_station_code")
	private String vehicleStationCode;
	
	@Column(name = "vehicle_station_city")
	private String vehicleStationCity;
	
	@Column(name = "vehicle_statue")
	private boolean status;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@ManyToOne
	@JoinColumn(name = "created_by", nullable = false)
	private User user;
	
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVehicleStastionName() {
		return vehicleStastionName;
	}

	public void setVehicleStastionName(String vehicleStastionName) {
		this.vehicleStastionName = vehicleStastionName;
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
