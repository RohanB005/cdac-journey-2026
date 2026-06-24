package com.demo.model;

import javax.persistence.Entity;

@Entity
public class Bike extends Vehicle{
	private int mileage;
	public Bike() {
		
	}
	public Bike(int id, String brand, int mileage) {
		super(id, brand);
		this.mileage = mileage;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return "Bike [mileage=" + mileage + "]";
	}
}
