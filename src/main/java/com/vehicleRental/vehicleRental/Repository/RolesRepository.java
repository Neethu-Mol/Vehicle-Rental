package com.vehicleRental.vehicleRental.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicleRental.vehicleRental.Model.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Long>{

}
