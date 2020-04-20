package com.usecase.logintable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
	
	@Id
	private String userid;
	private String password;
	private String cusomername;
	private String lastlogindate;
	private String customertype;
	private String customersessionid;
	private String sessionstatus;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCusomername() {
		return cusomername;
	}
	public void setCusomername(String cusomername) {
		this.cusomername = cusomername;
	}
	public String getLastlogindate() {
		return lastlogindate;
	}
	public void setLastlogindate(String lastlogindate) {
		this.lastlogindate = lastlogindate;
	}
	public String getCustomertype() {
		return customertype;
	}
	public void setCustomertype(String customertype) {
		this.customertype = customertype;
	}
	public String getCustomersessionid() {
		return customersessionid;
	}
	public void setCustomersessionid(String customersessionid) {
		this.customersessionid = customersessionid;
	}
	public String getSessionstatus() {
		return sessionstatus;
	}
	public void setSessionstatus(String sessionstatus) {
		this.sessionstatus = sessionstatus;
	}

}
