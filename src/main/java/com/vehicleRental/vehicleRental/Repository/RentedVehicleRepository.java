package com.vehicleRental.vehicleRental.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vehicleRental.vehicleRental.Model.RentedVehicles;

@Repository
public interface RentedVehicleRepository extends JpaRepository<RentedVehicles, Long>{

	@Query(value = "SELECT * FROM rented_vehicle_table r left join  vehicles_table v on r.vehicle_id = v.vehicle_id where v.vehicle_number  = :vehicleNumber", nativeQuery = true)
	RentedVehicles findByVehicle(String vehicleNumber);
}
