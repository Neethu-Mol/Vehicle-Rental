package com.vehicleRental.vehicleRental.RequestBody;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDto {
	private int status;
	private Boolean success;
	private String message;
	private Object data;
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public ResponseDto() {
	}

	public ResponseDto(ResponseDto dto, HttpStatus ok) {
	}

	public ResponseDto(Boolean success, String message, Object data) {
		this.success = success;
		this.message = message;
		this.data = data;
	}

	public ResponseDto(int status, Boolean success, String message, Object data) {
		this.success = success;
		this.message = message;
		this.data = data;
		this.status = status;
	}
}
