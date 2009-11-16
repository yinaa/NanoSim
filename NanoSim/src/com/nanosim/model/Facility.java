package com.nanosim.model;

import java.io.Serializable;

import java.util.Date;

public class Facility implements Serializable {

	private static final long serialVersionUID = -2465897958505283958L;
	
	private int facilityId;
	private String facilityProposal;
	private String facilitySources;
	private int facilityTypeId;
	private String failed;
	private String failedMessage;
	private int groupId;
	private String ownsFacility;
	private Date purchased;
	private int timeLeft;
	private String title;

	public Facility() {
	}

	public int getFacilityId() {
		return this.facilityId;
	}

	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
	}

	public String getFacilityProposal() {
		return this.facilityProposal;
	}

	public void setFacilityProposal(String facilityProposal) {
		this.facilityProposal = facilityProposal;
	}

	public String getFacilitySources() {
		return this.facilitySources;
	}

	public void setFacilitySources(String facilitySources) {
		this.facilitySources = facilitySources;
	}

	public int getFacilityTypeId() {
		return this.facilityTypeId;
	}

	public void setFacilityTypeId(int facilityTypeId) {
		this.facilityTypeId = facilityTypeId;
	}

	public String getFailed() {
		return this.failed;
	}

	public void setFailed(String failed) {
		this.failed = failed;
	}

	public String getFailedMessage() {
		return this.failedMessage;
	}

	public void setFailedMessage(String failedMessage) {
		this.failedMessage = failedMessage;
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getOwnsFacility() {
		return this.ownsFacility;
	}

	public void setOwnsFacility(String ownsFacility) {
		this.ownsFacility = ownsFacility;
	}

	public Date getPurchased() {
		return this.purchased;
	}

	public void setPurchased(Date purchased) {
		this.purchased = purchased;
	}

	public int getTimeLeft() {
		return this.timeLeft;
	}

	public void setTimeLeft(int timeLeft) {
		this.timeLeft = timeLeft;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}