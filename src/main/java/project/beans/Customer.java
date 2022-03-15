package project.beans;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="Customer")
public class Customer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4057851623706813806L;

	@Id
	@GeneratedValue( strategy = GenerationType. IDENTITY   )
	int custId;
	
	@Column(name = "name")
	private String Name;
	
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getPhone_no() {
		return Phone_no;
	}

	public void setPhone_no(String phone_no) {
		Phone_no = phone_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	@Column(name = "phoneNo")
	String Phone_no;
	
	@Column(name = "email")
	String email;
	
	@Column(name = "accNo")
	String accountNo;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
