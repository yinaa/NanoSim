package com.nanosim.model;

import java.io.Serializable;

import java.util.Date;

public class Mission implements Serializable {

	private static final long serialVersionUID = -4234907443264461416L;
	
	private int missionId;
	private Date built;
	private Date builtBegun;
	private float cost;
	private Date created;
	private float duration;
	private Date finished;
	private int groupId;
	private Date launched;
	private String result;
	private String resultMessage;
	private String stage;
	private String title;

	public Mission() {
	}

	public int getMissionId() {
		return this.missionId;
	}

	public void setMissionId(int missionId) {
		this.missionId = missionId;
	}

	public Date getBuilt() {
		return this.built;
	}

	public void setBuilt(Date built) {
		this.built = built;
	}

	public Date getBuiltBegun() {
		return this.builtBegun;
	}

	public void setBuiltBegun(Date builtBegun) {
		this.builtBegun = builtBegun;
	}

	public float getCost() {
		return this.cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public float getDuration() {
		return this.duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public Date getFinished() {
		return this.finished;
	}

	public void setFinished(Date finished) {
		this.finished = finished;
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public Date getLaunched() {
		return this.launched;
	}

	public void setLaunched(Date launched) {
		this.launched = launched;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getStage() {
		return this.stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}