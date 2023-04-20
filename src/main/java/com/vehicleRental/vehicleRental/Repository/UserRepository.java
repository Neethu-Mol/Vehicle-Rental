package com.vehicleRental.vehicleRental.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vehicleRental.vehicleRental.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByPhone(String phone);
	
	@Query("select r.roleName from User u left join Roles r on u.roles.id = r.id where u.id = :id")
	String findByRoleName(int userId);

}
