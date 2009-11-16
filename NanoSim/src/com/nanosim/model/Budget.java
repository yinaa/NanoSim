package com.nanosim.model;

import java.io.Serializable;
import java.util.Date;

public class Budget implements Serializable {

	private static final long serialVersionUID = 6710322197663774769L;

	private int budgetId;
	private float credit;
	private int groupId;
	private String purpose;
	private Date time;

	private float total;

	public Budget() {
	}

	public Budget(Date t, float c) {
		this.time = t;
		this.credit = c;
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

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public float getTotal() {
		return this.total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
}