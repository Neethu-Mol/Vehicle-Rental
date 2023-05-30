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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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


}
