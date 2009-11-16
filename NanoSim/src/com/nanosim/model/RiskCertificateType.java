package com.nanosim.model;

import java.io.Serializable;

public class RiskCertificateType implements Serializable {

	private static final long serialVersionUID = -6339661994644811091L;
	
	private int certificateTypeId;
	private int applicationCost;
	private int cost;
	private String description;
	private int duration;
	private String requires;
	private int riskReduction;
	private String title;

    public RiskCertificateType() {
    }

	public int getCertificateTypeId() {
		return this.certificateTypeId;
	}

	public void setCertificateTypeId(int certificateTypeId) {
		this.certificateTypeId = certificateTypeId;
	}

	public int getApplicationCost() {
		return this.applicationCost;
	}

	public void setApplicationCost(int applicationCost) {
		this.applicationCost = applicationCost;
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

	public String getRequires() {
		return this.requires;
	}

	public void setRequires(String requires) {
		this.requires = requires;
	}

	public int getRiskReduction() {
		return this.riskReduction;
	}

	public void setRiskReduction(int riskReduction) {
		this.riskReduction = riskReduction;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}