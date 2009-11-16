package com.nanosim.model;

import java.io.Serializable;

public class SocialScore implements Serializable {

	private static final long serialVersionUID = -3592662420918338219L;
	
	private int groupId;
	private int score;

    public SocialScore() {
    }

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}