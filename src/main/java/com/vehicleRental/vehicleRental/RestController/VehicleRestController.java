package com.vehicleRental.vehicleRental.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleRental.vehicleRental.RequestBody.ResponseDto;
import com.vehicleRental.vehicleRental.RequestBody.VehicleDTO;
import com.vehicleRental.vehicleRental.Services.VehicleService;

@RestController
@RequestMapping("api/vehicle")
public class VehicleRestController {
	
	@Autowired
	private VehicleService service;
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDto> addVehicleDetails(@RequestBody VehicleDTO vehicledto){
		if(null != vehicledto) {
			return new ResponseEntity<>(service.addVehicleDetails(vehicledto), HttpStatus.OK);
		}
		return null;
		
	}
	

}
