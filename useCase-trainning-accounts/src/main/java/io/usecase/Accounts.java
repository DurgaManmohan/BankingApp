package io.usecase;

public class Accounts {

	
	private String sessionid;
	private String userid;
	
	public Accounts(String sessionid, String userid) {
		super();
		this.sessionid = sessionid;
		this.userid = userid;
	}
	public String getSessionid() {
		return sessionid;
	}
	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public Accounts() {
		
	}
	
}
