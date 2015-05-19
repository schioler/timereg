package dk.bitmovers.timeregistration.model;

// Generated May 3, 2015 11:09:22 AM by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * RegistrationEvent generated by hbm2java
 */
public class RegistrationEvent implements java.io.Serializable {

	private int id;
	private RegistrationItem registrationItem;
	private User user;
	private WorkClockEvent workClockEvent;
	private Date created;
	private Date eventTime;
	private String comments;

	public RegistrationEvent() {
	}

	public RegistrationEvent(int id, RegistrationItem registrationItem,
			User user, WorkClockEvent workClockEvent, Date created,
			Date eventTime) {
		this.id = id;
		this.registrationItem = registrationItem;
		this.user = user;
		this.workClockEvent = workClockEvent;
		this.created = created;
		this.eventTime = eventTime;
	}

	public RegistrationEvent(int id, RegistrationItem registrationItem,
			User user, WorkClockEvent workClockEvent, Date created,
			Date eventTime, String comments) {
		this.id = id;
		this.registrationItem = registrationItem;
		this.user = user;
		this.workClockEvent = workClockEvent;
		this.created = created;
		this.eventTime = eventTime;
		this.comments = comments;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RegistrationItem getRegistrationItem() {
		return this.registrationItem;
	}

	public void setRegistrationItem(RegistrationItem registrationItem) {
		this.registrationItem = registrationItem;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public WorkClockEvent getWorkClockEvent() {
		return this.workClockEvent;
	}

	public void setWorkClockEvent(WorkClockEvent workClockEvent) {
		this.workClockEvent = workClockEvent;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getEventTime() {
		return this.eventTime;
	}

	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}