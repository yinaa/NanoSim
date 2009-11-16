package com.nanosim.model;

import java.io.Serializable;

public class FailureRate implements Serializable {

	private static final long serialVersionUID = -6851657064267844886L;
	
	private int cost;
	private int failureRate;
	private int time;

    public FailureRate() {
    }

	public int getCost() {
		return this.cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getFailureRate() {
		return this.failureRate;
	}

	public void setFailureRate(int failureRate) {
		this.failureRate = failureRate;
	}

	public int getTime() {
		return this.time;
	}

	public void setTime(int time) {
		this.time = time;
	}

}