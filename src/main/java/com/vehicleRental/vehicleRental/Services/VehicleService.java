package com.vehicleRental.vehicleRental.Services;

import com.vehicleRental.vehicleRental.RequestBody.ResponseDto;
import com.vehicleRental.vehicleRental.RequestBody.VehicleDTO;

public interface VehicleService {
	ResponseDto addVehicleDetails(VehicleDTO vehicledto);
}
