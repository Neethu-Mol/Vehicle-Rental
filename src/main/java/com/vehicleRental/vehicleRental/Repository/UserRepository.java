package com.vehicleRental.vehicleRental.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vehicleRental.vehicleRental.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByPhone(String phone);
	
	@Query("select r.roleName from User u left join Roles r on u.roles.id = r.id where u.id = :userId")
	String findByRoleNames(long userId);
	
	@Query(value = "SELECT r.role_name FROM users_table u INNER JOIN roles_table r ON u.role_id = r.role_id WHERE u.user_id = :userId", nativeQuery = true)
	String findByRoleName(long userId);

}
