package com.vehicleRental.vehicleRental.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vehicleRental.vehicleRental.Model.VehicleAssignedStations;



@Repository
public interface VehicleAssignedStationRepository extends JpaRepository<VehicleAssignedStations, Long>{
	
	@Query("select * from VehicleAssignedStations v left join VehicleStation vs on v.vehicleStation.id = vs.id where vs.vehicleStastionName = :vehicleStastionName")
	List<VehicleAssignedStations> listofVehicles(String vehicleStastionName);
	

}
