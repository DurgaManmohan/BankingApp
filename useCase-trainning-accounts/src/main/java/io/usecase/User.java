package io.usecase;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity
//@Table(name = "USR_TABLE")
public class User {
	
	
	
	
	
	//@Id
	private int id;
	private String userName;
	private String password;
	private String email;
	private String Customer_Session_Id;
	private String customer_type;
	private String Session_status;
	private String last_login_date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCustomer_Session_Id() {
		return Customer_Session_Id;
	}
	public void setCustomer_Session_Id(String customer_Session_Id) {
		Customer_Session_Id = customer_Session_Id;
	}
	public String getCustomer_type() {
		return customer_type;
	}
	public void setCustomer_type(String customer_type) {
		this.customer_type = customer_type;
	}
	public String getSession_status() {
		return Session_status;
	}
	public void setSession_status(String session_status) {
		Session_status = session_status;
	}
	public String getLast_login_date() {
		return last_login_date;
	}
	public void setLast_login_date(String last_login_date) {
		this.last_login_date = last_login_date;
	}
	
	

	public User(int id, String userName, String password, String email, String customer_Session_Id,
			String customer_type, String session_status, String last_login_date) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
		Customer_Session_Id = customer_Session_Id;
		this.customer_type = customer_type;
		Session_status = session_status;
		this.last_login_date = last_login_date;
	}
	
	
	public User()
	{
		
	}
	
	
	
	

	

}
