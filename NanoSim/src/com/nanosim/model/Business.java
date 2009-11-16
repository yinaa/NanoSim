package com.nanosim.model;

import java.io.Serializable;

import java.util.Date;

public class Business implements Serializable {

	private static final long serialVersionUID = -5254333998481502545L;
	
	private int businessId;
	private int groupId;
	private String proposal;
	private String responded;
	private String response;
	private Date sent;

	public Business() {
	}

	public int getBusinessId() {
		return this.businessId;
	}

	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getProposal() {
		return this.proposal;
	}

	public void setProposal(String proposal) {
		this.proposal = proposal;
	}

	public String getResponded() {
		return this.responded;
	}

	public void setResponded(String responded) {
		this.responded = responded;
	}

	public String getResponse() {
		return this.response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public Date getSent() {
		return this.sent;
	}

	public void setSent(Date sent) {
		this.sent = sent;
	}

}