package com.zensar.bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column
	private String doorName;
	@Column
	private String areaName;
	@Column
	private String cityName;
	
	public Address(String doorName, String areaName, String cityName) {
		super();
		this.doorName = doorName;
		this.areaName = areaName;
		this.cityName = cityName;
	}
	
	public Address() {
		super();
	}
	
	public String getDoorName() {
		return doorName;
	}
	public void setDoorName(String doorName) {
		this.doorName = doorName;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Address [doorName=" + doorName + ", areaName=" + areaName + ", cityName=" + cityName + "]";
	}
}