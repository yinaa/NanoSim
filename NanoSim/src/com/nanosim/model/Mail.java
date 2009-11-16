package com.nanosim.model;

import java.io.Serializable;

import java.util.Date;

public class Mail implements Serializable {

	private static final long serialVersionUID = 1662363742565681819L;
	
	private int mailId;
	private int fromGroup;
	private String message;
	private Date sent;
	private String subject;
	private int toGroup;
	private String unread;

	public Mail() {
	}

	public int getMailId() {
		return this.mailId;
	}

	public void setMailId(int mailId) {
		this.mailId = mailId;
	}

	public int getFromGroup() {
		return this.fromGroup;
	}

	public void setFromGroup(int fromGroup) {
		this.fromGroup = fromGroup;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getSent() {
		return this.sent;
	}

	public void setSent(Date sent) {
		this.sent = sent;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getToGroup() {
		return this.toGroup;
	}

	public void setToGroup(int toGroup) {
		this.toGroup = toGroup;
	}

	public String getUnread() {
		return this.unread;
	}

	public void setUnread(String unread) {
		this.unread = unread;
	}

}