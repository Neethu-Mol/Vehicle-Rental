package com.vehicleRental.vehicleRental.RequestBody;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehicleStationDTO {

	private long id;

	private String vehicleStastionName;

	private String vehicleStationCode;

	private String vehicleStationCity;

	private boolean status;

	private LocalDateTime createdAt;

	private long createdBy;

}
