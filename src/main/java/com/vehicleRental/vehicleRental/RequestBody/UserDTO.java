package com.vehicleRental.vehicleRental.RequestBody;

import java.time.LocalDateTime;


import com.sun.istack.NotNull;


public class UserDTO {

	private int id;
	
	@NotNull
	private String phone;
	
	private String password;
	
	private String userName;
	
	private boolean status;
	
	private LocalDateTime createdAt;
	
	private LocalDateTime updatedAt; 
}
