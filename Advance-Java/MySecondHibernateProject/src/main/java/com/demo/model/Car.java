package com.demo.model;

import javax.persistence.Entity;

@Entity
public class Car extends Vehicle{
	private int seats;
	public Car() {
		
	}
	public Car(int id, String brand, int seats) {
		super(id, brand);
		this.seats = seats;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "Car [seats=" + seats + "]";
	}

}
