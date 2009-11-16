package com.nanosim.model;

import java.io.Serializable;

public class FacilityUser implements Serializable {

	private static final long serialVersionUID = -2353394173061537562L;
	
	private int facilityUserId;
	private int facilityId;
	private int groupId;

	public FacilityUser() {
	}

	public int getFacilityUserId() {
		return this.facilityUserId;
	}

	public void setFacilityUserId(int facilityUserId) {
		this.facilityUserId = facilityUserId;
	}

	public int getFacilityId() {
		return this.facilityId;
	}

	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

}