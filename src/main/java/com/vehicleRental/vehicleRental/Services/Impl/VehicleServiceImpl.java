package com.vehicleRental.vehicleRental.Services.Impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.vehicleRental.vehicleRental.Model.User;
import com.vehicleRental.vehicleRental.Model.Vehicle;
import com.vehicleRental.vehicleRental.Repository.UserRepository;
import com.vehicleRental.vehicleRental.Repository.VehicleRepository;
import com.vehicleRental.vehicleRental.RequestBody.ResponseDto;
import com.vehicleRental.vehicleRental.RequestBody.VehicleDTO;
import com.vehicleRental.vehicleRental.Services.VehicleService;

public class VehicleServiceImpl implements VehicleService{
	
	@Autowired
	private VehicleRepository vehicleDao;
	
	@Autowired
	private UserRepository userDao;

	@Override
	public ResponseDto addVehicleDetails(VehicleDTO vehicledto) {

		String checkUser = userDao.findByRoleName(vehicledto.getCreatedBy());
		if("admin".equals(checkUser)) {
			Vehicle checkVehicle = vehicleDao.findByVehicleNumberIgnoreCase(vehicledto.getVehicleNumber());
			if(null != checkVehicle) {
				return new ResponseDto(200, true, "Vehicle number already exist", checkVehicle);
			}else {
				
				User newUser = new User();
				newUser.setId(vehicledto.getCreatedBy());
				Vehicle newVehicle = new Vehicle();
				BeanUtils.copyProperties(vehicledto, newVehicle);
				newVehicle.setUser(newUser);
				
				return new ResponseDto(200, true, "Registration successfully completed", vehicleDao.save(newVehicle));
			}
		}else {
			return new ResponseDto(400, false, "admin can add only vehicle details", null);
		}
		
		
	}

}
