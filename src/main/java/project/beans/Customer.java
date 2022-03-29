package project.beans;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class Customer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4057851623706813806L;

	@Id
	@GeneratedValue( strategy = GenerationType. IDENTITY   )
	int custId;

	String name;
	
	String phoneNo;
	
	String email;
	
	String accNo;
	
	public int getCustId() {
		return custId;
	}
	
	String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String pass) {
		password = pass;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", phoneNo=" + phoneNo + ", email=" + email
				+ ", accNo=" + accNo + ", password=" + password + "]";
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phone_no) {
		phoneNo = phone_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccountNo() {
		return accNo;
	}

	public void setAccountNo(String accountNo) {
		this.accNo = accountNo;
	}



	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}
}
