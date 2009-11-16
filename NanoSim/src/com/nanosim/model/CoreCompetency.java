package com.nanosim.model;

import java.io.Serializable;

public class CoreCompetency implements Serializable {

	private static final long serialVersionUID = -2700898846832533000L;
	
	private int groupId;
	private int coreArea;
	private int timeReduction;

	public CoreCompetency() {
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getCoreArea() {
		return this.coreArea;
	}

	public void setCoreArea(int coreArea) {
		this.coreArea = coreArea;
	}

	public int getTimeReduction() {
		return this.timeReduction;
	}

	public void setTimeReduction(int timeReduction) {
		this.timeReduction = timeReduction;
	}

}