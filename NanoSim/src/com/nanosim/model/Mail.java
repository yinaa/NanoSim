package com.nanosim.model;

/**
 * A simple structure containing the basic components of an email.
 */
public final class Mail {

  /**
   * The sender's name.
   */
  public String sender;

  /**
   * The sender's email.
   */
  public String email;

  /**
   * The email subject line.
   */
  public String subject;

  /**
   * The email's HTML body.
   */
  public String body;

  /**
   * Read flag.
   */
  public boolean read;

  public Mail(String sender, String email, String subject, String body) {
    this.sender = sender;
    this.email = email;
    this.subject = subject;
    this.body = body;
  }
}
