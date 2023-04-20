package com.vehicleRental.vehicleRental.Services;

import com.vehicleRental.vehicleRental.RequestBody.ResponseDto;

public interface UserService {

	
	public ResponseDto checkUserExistOrNot(String phone, String otp);
	
	public ResponseDto generateOtp(String phone);
}
