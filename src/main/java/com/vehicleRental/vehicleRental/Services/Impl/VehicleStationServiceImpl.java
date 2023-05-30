package com.vehicleRental.vehicleRental.Services.Impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleRental.vehicleRental.Model.User;
import com.vehicleRental.vehicleRental.Model.VehicleAssignedStations;
import com.vehicleRental.vehicleRental.Model.VehicleStation;
import com.vehicleRental.vehicleRental.Repository.UserRepository;
import com.vehicleRental.vehicleRental.Repository.VehicleAssignedStationRepository;
import com.vehicleRental.vehicleRental.Repository.VehicleStationRepository;
import com.vehicleRental.vehicleRental.RequestBody.ResponseDto;
import com.vehicleRental.vehicleRental.RequestBody.VehicleStationDTO;
import com.vehicleRental.vehicleRental.Services.VehicleStationService;


@Service
public class VehicleStationServiceImpl implements VehicleStationService{
	
	@Autowired
	private VehicleStationRepository vehicleStationDao;
	
	@Autowired
	private UserRepository userDao;

	@Autowired 
	private VehicleAssignedStationRepository vasService;

	@Override
	public ResponseDto addVehicleStationDetails(VehicleStationDTO vehicleStationdto) {
		String checkUser = userDao.findByRoleName(vehicleStationdto.getCreatedBy());
		if("admin".equals(checkUser)) {
			VehicleStation checkVehicleStation = vehicleStationDao.findByVehicleStationCodeIgnoreCase(vehicleStationdto.getVehicleStationCode());
			if(null != checkVehicleStation) {
				return new ResponseDto(200, true, "Vehicle number already exist", null);
			}else {
				
				User newUser = new User();
				newUser.setId(vehicleStationdto.getCreatedBy());
				VehicleStation newVehicleStation = new VehicleStation();
				BeanUtils.copyProperties(vehicleStationdto, newVehicleStation);
				newVehicleStation.setUser(newUser);
				
				return new ResponseDto(200, true, "Registration successfully completed", vehicleStationDao.save(newVehicleStation));
			}
		}else {
			return new ResponseDto(400, false, "admin can add only vehicle details", null);
		}
	}



	@Override
	public ResponseDto listAvailableVehicleInStation(String station) {
		List<VehicleAssignedStations> listofData = vasService.listofVehicles(station);
		if(!listofData.isEmpty()) {
			return new ResponseDto(200, true, "Data are loaded", listofData);
		}
		return new ResponseDto(400, false, "no data found", null);
	}

}
