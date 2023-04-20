package com.vehicleRental.vehicleRental.Services;

import com.vehicleRental.vehicleRental.RequestBody.ResponseDto;
import com.vehicleRental.vehicleRental.RequestBody.VehicleStationDTO;

public interface VehicleStationService {

	ResponseDto addVehicleStationDetails(VehicleStationDTO vehicleStationdto);

	ResponseDto listAvailableVehicleInStation(String station);

}
