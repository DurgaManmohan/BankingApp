package io.javabrains.entity;



import java.text.SimpleDateFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Session {
	

	private String loginstatus;
	private String customername;
	private String customertype;
	private String lastlogindate;
	private String sessionid;
	
	
	public Session(String loginstatus, String customername, String customertype, String lastlogindate,
			String sessionid) {
		super();
		this.loginstatus = loginstatus;
		this.customername = customername;
		this.customertype = customertype;
		this.lastlogindate = lastlogindate;
		this.sessionid = sessionid;
	}
	
	
	public String getLoginstatus() {
		return loginstatus;
	}

	public void setLoginstatus(String loginstatus) {
		this.loginstatus = loginstatus;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomertype() {
		return customertype;
	}

	public void setCustomertype(String customertype) {
		this.customertype = customertype;
	}


	public String getSessionid() {
		return sessionid;
	}

	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}


	public String getLastlogindate() {
		return lastlogindate;
	}


	public void setLastlogindate(String lastlogindate) {
		this.lastlogindate = lastlogindate;
	}


	
	
	
}
