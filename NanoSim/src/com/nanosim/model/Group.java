package com.nanosim.model;

import java.io.Serializable;

public class Group implements Serializable {

	private static final long serialVersionUID = -8449529016272321612L;

	private long groupId;
	private double budget;
	//private long classId;
	private long groupTypeId;
	private String name;
	private String objective;

	public Group() {
	}

	public long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public double getBudget() {
		return this.budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

//	public long getClassId() {
//		return this.classId;
//	}
//
//	public void setClassId(long classId) {
//		this.classId = classId;
//	}

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

	public String getObjective() {
		return this.objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}
}