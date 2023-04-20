package com.vehicleRental.vehicleRental.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicleRental.vehicleRental.Model.VehicleStation;

@Repository
public interface VehicleStationRepository extends JpaRepository<VehicleStation, Long>{
	
	
	VehicleStation findByVehicleStationCodeIgnoreCase(String code);

}
