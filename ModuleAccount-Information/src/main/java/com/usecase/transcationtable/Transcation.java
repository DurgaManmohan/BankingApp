package com.usecase.transcationtable;

import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class Transcation {

	
	
	@Id
	private int accountnumber;
	private String transcationdate;
    private int transcationamount;
    private String transcationcurrency;
    private String transcationstatus;
    private String transcationdescription;
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getTranscationdate() {
		return transcationdate;
	}
	public void setTranscationdate(String transcationdate) {
		this.transcationdate = transcationdate;
	}
	public int getTranscationamount() {
		return transcationamount;
	}
	public void setTranscationamount(int transcationamount) {
		this.transcationamount = transcationamount;
	}
	public String getTranscationcurrency() {
		return transcationcurrency;
	}
	public void setTranscationcurrency(String transcationcurrency) {
		this.transcationcurrency = transcationcurrency;
	}
	public String getTranscationstatus() {
		return transcationstatus;
	}
	public void setTranscationstatus(String transcationstatus) {
		this.transcationstatus = transcationstatus;
	}
	public String getTranscationdescription() {
		return transcationdescription;
	}
	public void setTranscationdescription(String transcationdescription) {
		this.transcationdescription = transcationdescription;
	}
	
	public Transcation(int accountnumber, String transcationdate, int transcationamount, String transcationcurrency,
			String transcationstatus, String transcationdescription) {
		super();
		this.accountnumber = accountnumber;
		this.transcationdate = transcationdate;
		this.transcationamount = transcationamount;
		this.transcationcurrency = transcationcurrency;
		this.transcationstatus = transcationstatus;
		this.transcationdescription = transcationdescription;
	}
	
	Transcation()
	{
		
	}
	
    
    
}
