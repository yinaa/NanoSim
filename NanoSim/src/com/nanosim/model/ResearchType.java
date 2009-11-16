package com.nanosim.model;

import java.io.Serializable;

public class ResearchType implements Serializable {

	private static final long serialVersionUID = 6363973989172591373L;
	
	private int researchTypeId;
	private String andParents;
	private String children;
	private int coreArea;
	private int cost;
	private String description;
	private int duration;
	private String facilityReq;
	private int level;
	private String orParents;
	private String title;

	public ResearchType() {
	}

	public int getResearchTypeId() {
		return this.researchTypeId;
	}

	public void setResearchTypeId(int researchTypeId) {
		this.researchTypeId = researchTypeId;
	}

	public String getAndParents() {
		return this.andParents;
	}

	public void setAndParents(String andParents) {
		this.andParents = andParents;
	}

	public String getChildren() {
		return this.children;
	}

	public void setChildren(String children) {
		this.children = children;
	}

	public int getCoreArea() {
		return this.coreArea;
	}

	public void setCoreArea(int coreArea) {
		this.coreArea = coreArea;
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

	public String getFacilityReq() {
		return this.facilityReq;
	}

	public void setFacilityReq(String facilityReq) {
		this.facilityReq = facilityReq;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getOrParents() {
		return this.orParents;
	}

	public void setOrParents(String orParents) {
		this.orParents = orParents;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}