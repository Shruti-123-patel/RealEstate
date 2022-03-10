package beans;

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
	String Name;
	
	@Column(name = "phoneNo")
	String Phone_no;
	
	@Column(name = "email")
	String email;
	
	@Column(name = "accNo")
	String accountNo;
}
