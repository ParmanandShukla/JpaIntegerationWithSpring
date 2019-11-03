package com.js.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "restaurant_detail")
public class Restaurant implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "restaurant_no")
	protected int restaurantNo;
	@Column(name = "restaurant_name")
	protected String restaurantName;
	@Column(name = "restaurant_type")
	protected String restaurantType;
	@Column(name = "opening_hours")
	protected String openingHours;
	@Column(name = "closing_hours")
	protected String closingHours;
	@Column(name = "contect_no")
	protected String contectNo;
	
	public Restaurant() {}
	
	public Restaurant(int restaurantNo, String restaurantName, String restaurantType, String openingHours,
			String closingHours, String contectNo) {
		super();
		this.restaurantNo = restaurantNo;
		this.restaurantName = restaurantName;
		this.restaurantType = restaurantType;
		this.openingHours = openingHours;
		this.closingHours = closingHours;
		this.contectNo = contectNo;
	}
	public int getRestaurantNo() {
		return restaurantNo;
	}
	public void setRestaurantNo(int restaurantNo) {
		this.restaurantNo = restaurantNo;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestaurantType() {
		return restaurantType;
	}
	public void setRestaurantType(String restaurantType) {
		this.restaurantType = restaurantType;
	}
	public String getOpeningHours() {
		return openingHours;
	}
	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}
	public String getClosingHours() {
		return closingHours;
	}
	public void setClosingHours(String closingHours) {
		this.closingHours = closingHours;
	}
	public String getContectNo() {
		return contectNo;
	}
	public void setContectNo(String contectNo) {
		this.contectNo = contectNo;
	}
	@Override
	public String toString() {
		return "Restaurant [restaurantNo=" + restaurantNo + ", restaurantName=" + restaurantName + ", restaurantType="
				+ restaurantType + ", openingHours=" + openingHours + ", closingHours=" + closingHours + ", contectNo="
				+ contectNo + "]";
	}
	 
	 
}
