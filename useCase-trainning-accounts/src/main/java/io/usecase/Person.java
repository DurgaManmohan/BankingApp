package io.usecase;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;



//@Entity
public class Person {
	
	
	
  

	//@Id
	private String userid;
	private int accountnumber;
	private String accounttype;
    private int accountbranchcode;
    private int accountbalance;
    private String accountcurrency;
    private String accountstatus;
    
    
  	public Person(String userid, int accountnumber, String accounttype, int accountbranchcode, int accountbalance,
  			String accountcurrency, String accountstatus) {
  		super();
  		this.userid = userid;
  		this.accountnumber = accountnumber;
  		this.accounttype = accounttype;
  		this.accountbranchcode = accountbranchcode;
  		this.accountbalance = accountbalance;
  		this.accountcurrency = accountcurrency;
  		this.accountstatus = accountstatus;
  	}
   
   
    
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public int getAccountbranchcode() {
		return accountbranchcode;
	}
	public void setAccountbranchcode(int accountbranchcode) {
		this.accountbranchcode = accountbranchcode;
	}
	public int getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(int accountbalance) {
		this.accountbalance = accountbalance;
	}
	public String getAccountcurrency() {
		return accountcurrency;
	}
	public void setAccountcurrency(String accountcurrency) {
		this.accountcurrency = accountcurrency;
	}
	public String getAccountstatus() {
		return accountstatus;
	}
	public void setAccountstatus(String accountstatus) {
		this.accountstatus = accountstatus;
	}
	
    Person(){
    	
    }
	

}
