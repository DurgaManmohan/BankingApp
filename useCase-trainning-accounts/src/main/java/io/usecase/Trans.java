package io.usecase;

public class Trans {

	
	
	private String accountNumber;
	private String sessionid;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getSessionid() {
		return sessionid;
	}
	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}
	
	public Trans(String accountNumber, String sessionid) {
		super();
		this.accountNumber = accountNumber;
		this.sessionid = sessionid;
	}
	
	Trans(){
		
	}
	
}
