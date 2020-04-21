package io.usecase;

public class Status {
	private String sessionid;
	public String getSessionid() {
		return sessionid;
	}
	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}
	
	public Status(String sessionid) {
		super();
		this.sessionid = sessionid;
	}
	
	public Status()
	{
		
	}
}
