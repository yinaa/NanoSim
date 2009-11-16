package com.nanosim.model;

import java.io.Serializable;

public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -779653421827193669L;

	private long personId;

	private String name;

	private long groupId;

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return name.toLowerCase() + "@nanosim.com";
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}
}
