package io.javabrains.entity;

public class Logoff {
	private String loginStatus;
	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}
	public String getLoginStatus() {
		return loginStatus;
	}
	
	public Logoff(String loginStatus) {
		this.loginStatus = loginStatus;
	}
	
}
