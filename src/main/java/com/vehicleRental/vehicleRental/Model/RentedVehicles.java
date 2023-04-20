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
@Table(name = "rented_vehicle_table")
public class RentedVehicles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rv_id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "vehicle_id", nullable = false)
	private Vehicle vehicle;
	
	@ManyToOne
	@JoinColumn(name = "purchased_vs_id", nullable = false)
	private VehicleStation purchasedVehicleStation;
	
	@ManyToOne
	@JoinColumn(name = "returned_vs_id", nullable = false)
	private VehicleStation returnedVehicleStation;
	
	@Column(name = "rent_payment_status")
	private boolean rentPaymentStatus;
	
	@Column(name = "rv_statue")
	private boolean status;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at")
	private LocalDateTime updatedAt; 

}
