package com.vehicleRental.vehicleRental.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleRental.vehicleRental.RequestBody.ResponseDto;
import com.vehicleRental.vehicleRental.Services.UserService;

@RestController
@RequestMapping("api/user")
public class UserRestController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/generate-otp/{phone}")
	public ResponseEntity<ResponseDto> generateOtp(@PathVariable String phone){
		return new ResponseEntity<>(userService.generateOtp(phone), HttpStatus.OK);
	}
	
	
	@GetMapping("authenticate/{phone}/{otp}")
	public ResponseEntity<ResponseDto> userAuthentication(@PathVariable String phone, @PathVariable String otp) {
		if(!phone.isEmpty() && !otp.isEmpty()) {
			return new ResponseEntity<>(userService.checkUserExistOrNot(phone, otp), HttpStatus.OK);
		}
		return null;
	}
	
	
	
	

}
