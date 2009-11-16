package com.nanosim.model;

import java.io.Serializable;

public class GroupType implements Serializable {

	private static final long serialVersionUID = 2892477664295981025L;
	
	public final String GOVERNMENT = "Government"; 
	
	public final String FUNDING_AGENCY = "Fuding Agency"; 
	
	public final String PRIVATE_LAB = "Private Labratory"; 
	public final String PUBLIC_LAB = "Public Labratory";
	
	public final String REVIEW = "Review"; 
	public final String Newspaper = "Newspaper"; 
	public final String RISK_REDUCTION = "Risk Reduction"; 

	private long groupTypeId;
	private String name;
	private boolean hasBusiness;
	private boolean hasCertificates;
	private boolean hasFacilities;
	private boolean hasPatents;
	private boolean hasResearch;
	private boolean hasReview;
	private boolean newspaper;
	private boolean researchAvailability;
	private boolean viewAllBudgets;

	public GroupType() {
	}

	public long getGroupTypeId() {
		return this.groupTypeId;
	}

	public void setGroupTypeId(long groupTypeId) {
		this.groupTypeId = groupTypeId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getHasBusiness() {
		return this.hasBusiness;
	}

	public void setHasBusiness(boolean hasBusiness) {
		this.hasBusiness = hasBusiness;
	}

	public boolean getHasCertificates() {
		return this.hasCertificates;
	}

	public void setHasCertificates(boolean hasCertificates) {
		this.hasCertificates = hasCertificates;
	}

	public boolean getHasFacilities() {
		return this.hasFacilities;
	}

	public void setHasFacilities(boolean hasFacilities) {
		this.hasFacilities = hasFacilities;
	}

	public boolean getHasPatents() {
		return this.hasPatents;
	}

	public void setHasPatents(boolean hasPatents) {
		this.hasPatents = hasPatents;
	}

	public boolean getHasResearch() {
		return this.hasResearch;
	}

	public void setHasResearch(boolean hasResearch) {
		this.hasResearch = hasResearch;
	}

	public boolean getHasReview() {
		return this.hasReview;
	}

	public void setHasReview(boolean hasReview) {
		this.hasReview = hasReview;
	}

	public boolean getNewspaper() {
		return this.newspaper;
	}

	public void setNewspaper(boolean newspaper) {
		this.newspaper = newspaper;
	}

	public boolean getResearchAvailability() {
		return this.researchAvailability;
	}

	public void setResearchAvailability(boolean researchAvailability) {
		this.researchAvailability = researchAvailability;
	}

	public boolean getViewAllBudgets() {
		return this.viewAllBudgets;
	}

	public void setViewAllBudgets(boolean viewAllBudgets) {
		this.viewAllBudgets = viewAllBudgets;
	}
}