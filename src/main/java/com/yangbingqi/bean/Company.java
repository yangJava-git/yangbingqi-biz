package com.yangbingqi.bean;

import java.io.Serializable;
import java.util.Date;

public class Company implements Serializable{
	
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	private Integer id           ;
	
	private String name         ;
	
	private String corporation  ;
	
	private String address      ;
	
	private Integer capital      ;
	
	private String regist_no    ;
	
	private Integer type         ;
	
	private Date period       ;
	
	private Date created      ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCorporation() {
		return corporation;
	}

	public void setCorporation(String corporation) {
		this.corporation = corporation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getCapital() {
		return capital;
	}

	public void setCapital(Integer capital) {
		this.capital = capital;
	}

	public String getRegist_no() {
		return regist_no;
	}

	public void setRegist_no(String regist_no) {
		this.regist_no = regist_no;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Date getPeriod() {
		return period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", corporation=" + corporation + ", address=" + address
				+ ", capital=" + capital + ", regist_no=" + regist_no + ", type=" + type + ", period=" + period
				+ ", created=" + created + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((corporation == null) ? 0 : corporation.hashCode());
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((period == null) ? 0 : period.hashCode());
		result = prime * result + ((regist_no == null) ? 0 : regist_no.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (corporation == null) {
			if (other.corporation != null)
				return false;
		} else if (!corporation.equals(other.corporation))
			return false;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (period == null) {
			if (other.period != null)
				return false;
		} else if (!period.equals(other.period))
			return false;
		if (regist_no == null) {
			if (other.regist_no != null)
				return false;
		} else if (!regist_no.equals(other.regist_no))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	public Company(Integer id, String name, String corporation, String address, Integer capital, String regist_no,
			Integer type, Date period, Date created) {
		super();
		this.id = id;
		this.name = name;
		this.corporation = corporation;
		this.address = address;
		this.capital = capital;
		this.regist_no = regist_no;
		this.type = type;
		this.period = period;
		this.created = created;
	}

	public Company() {
		super();
	}
	
	
    
	

}
