package com.vehicleRental.vehicleRental.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleRental.vehicleRental.RequestBody.RentedVehicleDTO;
import com.vehicleRental.vehicleRental.RequestBody.ResponseDto;
import com.vehicleRental.vehicleRental.Services.RentedServices;

@RestController
@RequestMapping("api/rent")
public class RentedVehicleRestController {

	@Autowired
	private RentedServices service;
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDto> createRentedVehicle(@RequestBody RentedVehicleDTO rentedVehicleDTO){
		if(null != rentedVehicleDTO) {
			return new ResponseEntity<>(service.createRentedVehicle(rentedVehicleDTO), HttpStatus.OK);
		}
		return null;
		
	}
	
	@PostMapping("/update-rent")
	public ResponseEntity<ResponseDto> update(@RequestBody RentedVehicleDTO rentedVehicleDTO){
		if(null != rentedVehicleDTO) {
			return new ResponseEntity<>(service.update(rentedVehicleDTO), HttpStatus.OK);
		}
		return null;
		
	}
	
	@GetMapping("/search/{VehicleNumber}")
	public ResponseEntity<ResponseDto> updatePostUsage(@PathVariable String VehicleNumber){
		if(!"".equals(VehicleNumber)) {
			return new ResponseEntity<>(service.findVehiclePurchaseDetails(VehicleNumber), HttpStatus.OK);
		}
		return null;
		
	}
}
