package com.nanosim.model;

import java.io.Serializable;

public class FacilityType implements Serializable {

	private static final long serialVersionUID = 5282793835009099593L;
	
	private int facilityTypeId;
	private int cost;
	private String description;
	private int duration;
	private String type;

	public FacilityType() {
	}

	public int getFacilityTypeId() {
		return this.facilityTypeId;
	}

	public void setFacilityTypeId(int facilityTypeId) {
		this.facilityTypeId = facilityTypeId;
	}

	public int getCost() {
		return this.cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}