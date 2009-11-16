package com.nanosim.model;

import java.io.Serializable;

public class HiresAid implements Serializable {

	private static final long serialVersionUID = 633371515368736661L;
	
	private int hiringId;
	private int cost;
	private int hiredGroup;
	private int hiringGroup;
	private int researchTypeId;
	private int riskReduction;

    public HiresAid() {
    }

	public int getHiringId() {
		return this.hiringId;
	}

	public void setHiringId(int hiringId) {
		this.hiringId = hiringId;
	}

	public int getCost() {
		return this.cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getHiredGroup() {
		return this.hiredGroup;
	}

	public void setHiredGroup(int hiredGroup) {
		this.hiredGroup = hiredGroup;
	}

	public int getHiringGroup() {
		return this.hiringGroup;
	}

	public void setHiringGroup(int hiringGroup) {
		this.hiringGroup = hiringGroup;
	}

	public int getResearchTypeId() {
		return this.researchTypeId;
	}

	public void setResearchTypeId(int researchTypeId) {
		this.researchTypeId = researchTypeId;
	}

	public int getRiskReduction() {
		return this.riskReduction;
	}

	public void setRiskReduction(int riskReduction) {
		this.riskReduction = riskReduction;
	}

}