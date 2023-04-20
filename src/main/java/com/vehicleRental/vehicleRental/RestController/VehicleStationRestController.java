package com.vehicleRental.vehicleRental.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleRental.vehicleRental.RequestBody.ResponseDto;
import com.vehicleRental.vehicleRental.RequestBody.VehicleStationDTO;
import com.vehicleRental.vehicleRental.Services.VehicleStationService;

@RestController
@RequestMapping("api/vehicle-staion")
public class VehicleStationRestController {

	@Autowired
	private VehicleStationService service;

	@PostMapping("/create")
	public ResponseEntity<ResponseDto> addVehicleStationDetails(@RequestBody VehicleStationDTO vehicleStationdto) {

		if (null != vehicleStationdto) {
			return new ResponseEntity<>(service.addVehicleStationDetails(vehicleStationdto), HttpStatus.OK);
		}
		return null;

	}

	@GetMapping("/list-of-vehicle/{station}")
	public ResponseEntity<ResponseDto> listAvailableVehicleInStation(@PathVariable String station) {

		if (!"".equals(station)) {
			return new ResponseEntity<>(service.listAvailableVehicleInStation(station), HttpStatus.OK);
		}
		return null;

	}

}
