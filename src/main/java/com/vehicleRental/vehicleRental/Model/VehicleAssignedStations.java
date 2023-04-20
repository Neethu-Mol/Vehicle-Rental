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
@Table(name = "vehicle_assigned_station_table")
public class VehicleAssignedStations {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vas_id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "vehicle_id", nullable = false)
	private Vehicle vehicle;
	
	@ManyToOne
	@JoinColumn(name = "vehicle_station_id", nullable = false)
	private VehicleStation vehicleStation;
	
	
	@Column(name = "vas_statue")
	private boolean status;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at")
	private LocalDateTime updatedAt; 
}
