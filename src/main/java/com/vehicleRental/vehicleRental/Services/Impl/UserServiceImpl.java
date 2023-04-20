package com.vehicleRental.vehicleRental.Services.Impl;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleRental.vehicleRental.Model.Roles;
import com.vehicleRental.vehicleRental.Model.User;
import com.vehicleRental.vehicleRental.Repository.UserRepository;
import com.vehicleRental.vehicleRental.RequestBody.ResponseDto;
import com.vehicleRental.vehicleRental.Services.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userDao;

	@Override
	public ResponseDto checkUserExistOrNot(String phone, String otp) {
		
		User userObj = userDao.findByPhone(phone);
		if(null != userObj) {
			return new ResponseDto(200, true, "Logined Successfully", userObj);
		}else {
			try {
				
				Roles roleObj = new Roles();
				roleObj.setId(2);
				
				User newUserObj = new User();
				newUserObj.setPhone(phone);
				newUserObj.setPassword(otp);
				newUserObj.setUserName("New User");
				newUserObj.setRoles(roleObj);
				newUserObj.setStatus(true);
				newUserObj.setCreatedAt(LocalDateTime.now());
				newUserObj.setUpdatedAt(LocalDateTime.now()); 
				
				return new ResponseDto(200, true, "Registration successfully completed", userDao.save(newUserObj));
				
			}catch (Exception e) {
				 e.printStackTrace();
				 return new ResponseDto(400, false, "Registration failed", null);
			}
			
		}
		
		
	}

	@Override
	public ResponseDto generateOtp(String phone) {
		
		Map<String, String > otpMap = new HashMap<String, String>();
		Random rnd = new Random();
		int number = rnd.nextInt(999999);
		String otp = String.format("%06d", number);
		otpMap.put("OTP", otp);
		return new ResponseDto(200, true, "OTP Generated Successfully", otpMap);
	}

}
