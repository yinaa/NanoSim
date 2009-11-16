package com.nanosim.model;

import java.io.Serializable;

public class SocialScoreChange implements Serializable {
	
	private static final long serialVersionUID = -3894996970207853688L;
	
	private int changeId;
	private int adjustment;
	private int groupId;
	private String message;

    public SocialScoreChange() {
    }

	public int getChangeId() {
		return this.changeId;
	}

	public void setChangeId(int changeId) {
		this.changeId = changeId;
	}

	public int getAdjustment() {
		return this.adjustment;
	}

	public void setAdjustment(int adjustment) {
		this.adjustment = adjustment;
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}