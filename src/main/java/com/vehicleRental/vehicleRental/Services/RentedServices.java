package com.vehicleRental.vehicleRental.Services;

import com.vehicleRental.vehicleRental.RequestBody.RentedVehicleDTO;
import com.vehicleRental.vehicleRental.RequestBody.ResponseDto;

public interface RentedServices {

	ResponseDto createRentedVehicle(RentedVehicleDTO rentedVehicleDTO);

	ResponseDto findVehiclePurchaseDetails(String vehicleNumber);

}
