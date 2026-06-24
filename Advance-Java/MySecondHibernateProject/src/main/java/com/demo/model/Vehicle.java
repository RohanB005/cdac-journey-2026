package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity

@Inheritance(strategy = InheritanceType.JOINED)
public class Vehicle {
	@Id
	private int id;
	private String brand;
	public Vehicle() {
		
	}
	public Vehicle(int id, String brand) {
		this.id = id;
		this.brand = brand;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", brand=" + brand + "]";
	}
	

}
