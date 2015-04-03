package dk.schioler.tools.timeregistration.hibernate.pojo;

// Generated 03-04-2015 09:48:14 by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * UserProviderCodeLink generated by hbm2java
 */
public class UserProviderCodeLink implements java.io.Serializable {

	private int id;
	private ProviderCode providerCode;
	private User user;
	private Date created;
	private Date ended;

	public UserProviderCodeLink() {
	}

	public UserProviderCodeLink(ProviderCode providerCode, User user,
			Date created, Date ended) {
		this.providerCode = providerCode;
		this.user = user;
		this.created = created;
		this.ended = ended;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ProviderCode getProviderCode() {
		return this.providerCode;
	}

	public void setProviderCode(ProviderCode providerCode) {
		this.providerCode = providerCode;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getEnded() {
		return this.ended;
	}

	public void setEnded(Date ended) {
		this.ended = ended;
	}

}