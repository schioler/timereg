package dk.schioler.tools.timeregistration.hibernate.pojo;

// Generated 03-04-2015 09:48:14 by Hibernate Tools 4.3.1

/**
 * VwProviderCodeId generated by hbm2java
 */
public class VwProviderCodeId implements java.io.Serializable {

	private int providerId;
	private String providerName;
	private String providerCode;
	private String providerCodeName;
	private int providerCodeId;

	public VwProviderCodeId() {
	}

	public VwProviderCodeId(int providerId, String providerName,
			String providerCode, String providerCodeName, int providerCodeId) {
		this.providerId = providerId;
		this.providerName = providerName;
		this.providerCode = providerCode;
		this.providerCodeName = providerCodeName;
		this.providerCodeId = providerCodeId;
	}

	public int getProviderId() {
		return this.providerId;
	}

	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}

	public String getProviderName() {
		return this.providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getProviderCode() {
		return this.providerCode;
	}

	public void setProviderCode(String providerCode) {
		this.providerCode = providerCode;
	}

	public String getProviderCodeName() {
		return this.providerCodeName;
	}

	public void setProviderCodeName(String providerCodeName) {
		this.providerCodeName = providerCodeName;
	}

	public int getProviderCodeId() {
		return this.providerCodeId;
	}

	public void setProviderCodeId(int providerCodeId) {
		this.providerCodeId = providerCodeId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VwProviderCodeId))
			return false;
		VwProviderCodeId castOther = (VwProviderCodeId) other;

		return (this.getProviderId() == castOther.getProviderId())
				&& ((this.getProviderName() == castOther.getProviderName()) || (this
						.getProviderName() != null
						&& castOther.getProviderName() != null && this
						.getProviderName().equals(castOther.getProviderName())))
				&& ((this.getProviderCode() == castOther.getProviderCode()) || (this
						.getProviderCode() != null
						&& castOther.getProviderCode() != null && this
						.getProviderCode().equals(castOther.getProviderCode())))
				&& ((this.getProviderCodeName() == castOther
						.getProviderCodeName()) || (this.getProviderCodeName() != null
						&& castOther.getProviderCodeName() != null && this
						.getProviderCodeName().equals(
								castOther.getProviderCodeName())))
				&& (this.getProviderCodeId() == castOther.getProviderCodeId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getProviderId();
		result = 37
				* result
				+ (getProviderName() == null ? 0 : this.getProviderName()
						.hashCode());
		result = 37
				* result
				+ (getProviderCode() == null ? 0 : this.getProviderCode()
						.hashCode());
		result = 37
				* result
				+ (getProviderCodeName() == null ? 0 : this
						.getProviderCodeName().hashCode());
		result = 37 * result + this.getProviderCodeId();
		return result;
	}

}
