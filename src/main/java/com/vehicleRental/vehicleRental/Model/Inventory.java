package com.vehicleRental.vehicleRental.Model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventory_table")
public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "inventory_id")
	private long id;
	
	
}
