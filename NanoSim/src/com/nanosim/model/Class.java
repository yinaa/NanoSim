package com.nanosim.model;

import java.io.Serializable;


public class Class implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1777796391131297182L;
	private int classId;

    public Class() {
    }

	public int getClassId() {
		return this.classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

}