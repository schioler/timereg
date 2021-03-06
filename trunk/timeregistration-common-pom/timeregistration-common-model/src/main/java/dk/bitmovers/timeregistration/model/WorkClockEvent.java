package dk.bitmovers.timeregistration.model;

// Generated May 3, 2015 11:09:22 AM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * WorkClockEvent generated by hbm2java
 */
public class WorkClockEvent implements java.io.Serializable {

	private int id;
	private User user;
	private WorkClockEventType workClockEventType;
	private Date created;
	private Set<RegistrationEvent> registrationEvents = new HashSet<RegistrationEvent>(
			0);

	public WorkClockEvent() {
	}

	public WorkClockEvent(int id, User user,
			WorkClockEventType workClockEventType, Date created) {
		this.id = id;
		this.user = user;
		this.workClockEventType = workClockEventType;
		this.created = created;
	}

	public WorkClockEvent(int id, User user,
			WorkClockEventType workClockEventType, Date created,
			Set<RegistrationEvent> registrationEvents) {
		this.id = id;
		this.user = user;
		this.workClockEventType = workClockEventType;
		this.created = created;
		this.registrationEvents = registrationEvents;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public WorkClockEventType getWorkClockEventType() {
		return this.workClockEventType;
	}

	public void setWorkClockEventType(WorkClockEventType workClockEventType) {
		this.workClockEventType = workClockEventType;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Set<RegistrationEvent> getRegistrationEvents() {
		return this.registrationEvents;
	}

	public void setRegistrationEvents(Set<RegistrationEvent> registrationEvents) {
		this.registrationEvents = registrationEvents;
	}

}
