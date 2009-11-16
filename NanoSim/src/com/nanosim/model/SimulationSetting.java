package com.nanosim.model;

import java.io.Serializable;

public class SimulationSetting implements Serializable {

	private static final long serialVersionUID = 4774279767145443401L;
	
	private int settingsId;
	private int classId;
	private String name;
	private String value;

    public SimulationSetting() {
    }

	public int getSettingsId() {
		return this.settingsId;
	}

	public void setSettingsId(int settingsId) {
		this.settingsId = settingsId;
	}

	public int getClassId() {
		return this.classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}