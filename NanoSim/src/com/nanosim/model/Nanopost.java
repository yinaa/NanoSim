package com.nanosim.model;

import java.io.Serializable;

import java.util.Date;

public class Nanopost implements Serializable {

	private static final long serialVersionUID = -6080692606699082623L;
	
	private int nanopostId;
	private String body;
	private int classId;
	private Date postDate;
	private String subject;
	private String writer;

    public Nanopost() {
    }

	public int getNanopostId() {
		return this.nanopostId;
	}

	public void setNanopostId(int nanopostId) {
		this.nanopostId = nanopostId;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public int getClassId() {
		return this.classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public Date getPostDate() {
		return this.postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getWriter() {
		return this.writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

}