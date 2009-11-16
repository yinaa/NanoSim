package com.nanosim.model;

import java.io.Serializable;

import java.util.Date;

public class Funding implements Serializable {

	private static final long serialVersionUID = -2841945860028725034L;
	
	private int fundingId;
	private int fromGroup;
	private String proposal;
	private String responded;
	private String response;
	private Date sent;
	private String title;
	private int toGroup;

    public Funding() {
    }

	public int getFundingId() {
		return this.fundingId;
	}

	public void setFundingId(int fundingId) {
		this.fundingId = fundingId;
	}

	public int getFromGroup() {
		return this.fromGroup;
	}

	public void setFromGroup(int fromGroup) {
		this.fromGroup = fromGroup;
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getToGroup() {
		return this.toGroup;
	}

	public void setToGroup(int toGroup) {
		this.toGroup = toGroup;
	}

}