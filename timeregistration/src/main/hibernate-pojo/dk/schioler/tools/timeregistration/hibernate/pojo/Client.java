package dk.schioler.tools.timeregistration.hibernate.pojo;

// Generated 03-04-2015 09:48:14 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Client generated by hbm2java
 */
public class Client implements java.io.Serializable {

	private int id;
	private String name;
	private Date created;
	private Set clientCodes = new HashSet(0);

	public Client() {
	}

	public Client(String name, Date created) {
		this.name = name;
		this.created = created;
	}

	public Client(String name, Date created, Set clientCodes) {
		this.name = name;
		this.created = created;
		this.clientCodes = clientCodes;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Set getClientCodes() {
		return this.clientCodes;
	}

	public void setClientCodes(Set clientCodes) {
		this.clientCodes = clientCodes;
	}

}
