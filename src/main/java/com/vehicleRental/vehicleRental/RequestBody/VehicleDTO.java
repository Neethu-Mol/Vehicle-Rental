package com.vehicleRental.vehicleRental.RequestBody;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehicleDTO {

	private long id;

	private String vehicleName;

	private String vehicleNumber;

	private String vehicleModel;

	private int vehicleRentAmount;

	private boolean status;

	private long createdBy;

}
