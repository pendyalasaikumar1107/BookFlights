package com.FlightDemo.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Cart {
	@Id
	@Column
	private int flightid;
	@Column
	private int cartid;
	@Column
	private String airwaysname;
	@Column
	private String source;
	@Column
	private String destination;
	@Column
	private int seats;
	public int getFlightid() {
		return flightid;
	}
	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}
	public String getAirwaysname() {
		return airwaysname;
	}
	public void setAirwaysname(String airwaysname) {
		this.airwaysname = airwaysname;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}


}
