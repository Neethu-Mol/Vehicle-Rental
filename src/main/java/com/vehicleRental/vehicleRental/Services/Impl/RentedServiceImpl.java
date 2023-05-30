package com.vehicleRental.vehicleRental.Services.Impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleRental.vehicleRental.Model.RentedVehicles;
import com.vehicleRental.vehicleRental.Model.User;
import com.vehicleRental.vehicleRental.Model.Vehicle;
import com.vehicleRental.vehicleRental.Model.VehicleStation;
import com.vehicleRental.vehicleRental.Repository.RentedVehicleRepository;
import com.vehicleRental.vehicleRental.RequestBody.RentedVehicleDTO;
import com.vehicleRental.vehicleRental.RequestBody.ResponseDto;
import com.vehicleRental.vehicleRental.Services.RentedServices;

@Service
public class RentedServiceImpl implements RentedServices{
	
	@Autowired
	private RentedVehicleRepository rvDao;
	

	@Override
	public ResponseDto createRentedVehicle(RentedVehicleDTO rentedVehicleDTO) {
		
		RentedVehicles newRentedDto = new RentedVehicles();
		BeanUtils.copyProperties(rentedVehicleDTO, newRentedDto);
		User userObj = new User();
		userObj.setId(rentedVehicleDTO.getUserId());
		
		Vehicle vehicleObj = new Vehicle();
		vehicleObj.setId(rentedVehicleDTO.getVehicleId());
		
		VehicleStation purchasedStation = new VehicleStation();
		purchasedStation.setId(rentedVehicleDTO.getPurchasedVehicleStationId());
		
		newRentedDto.setUser(userObj);
		newRentedDto.setVehicle(vehicleObj);
		newRentedDto.setPurchasedVehicleStation(purchasedStation);
		
//		VehicleStation returnedStation = new VehicleStation();
//		returnedStation.setId(rentedVehicleDTO.getReturnedVehicleStationId());
		
		return new ResponseDto(200, true, "purchased successfully ", rvDao.save(newRentedDto));
		
		
	}

	@Override
	public ResponseDto findVehiclePurchaseDetails(String vehicleNumber) {
		
		RentedVehicles checkPurchasedVehicle = rvDao.findByVehicle(vehicleNumber);
		if(null != checkPurchasedVehicle) {
			return new ResponseDto(200, true, "booked vehicle details", checkPurchasedVehicle);
		}else {
			return new ResponseDto(400, false, "no vehicle found", null);
		}
		
		
	}

	@Override
	public ResponseDto update(RentedVehicleDTO rentedVehicleDTO) {
		
		Optional<RentedVehicles> newRentedDto = rvDao.findById(rentedVehicleDTO.getId());
		
		BeanUtils.copyProperties(rentedVehicleDTO, newRentedDto.get());
		User userObj = new User();
		userObj.setId(rentedVehicleDTO.getUserId());
		
		Vehicle vehicleObj = new Vehicle();
		vehicleObj.setId(rentedVehicleDTO.getVehicleId());
		
		VehicleStation purchasedStation = new VehicleStation();
		purchasedStation.setId(rentedVehicleDTO.getPurchasedVehicleStationId());
		
		VehicleStation returnedStation = new VehicleStation();
		returnedStation.setId(rentedVehicleDTO.getReturnedVehicleStationId());
		
		newRentedDto.get().setUser(userObj);
		newRentedDto.get().setVehicle(vehicleObj);
		newRentedDto.get().setPurchasedVehicleStation(purchasedStation);
		newRentedDto.get().setReturnedVehicleStation(returnedStation);
		
		
		
		return new ResponseDto(200, true, "updated successfully ", rvDao.save(newRentedDto.get()));
	}

}
