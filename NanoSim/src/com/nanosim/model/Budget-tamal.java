package com.nanosim.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Budget_Tamal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6710322197663774769L;
	
	private int budgetId;
	private float credit;
	private int groupId;
	private String purpose;
	private Timestamp time;

	private float total;

	public Budget_Tamal() {
	}

	public int getBudgetId() {
		return this.budgetId;
	}

	public void setBudgetId(int budgetId) {
		this.budgetId = budgetId;
	}

	public float getCredit() {
		return this.credit;
	}

	public void setCredit(float credit) {
		this.credit = credit;
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public float getTotal() {
		return this.total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

}