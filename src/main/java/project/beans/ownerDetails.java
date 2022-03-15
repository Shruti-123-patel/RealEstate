package project.beans;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ownerDetails")
public class ownerDetails implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 7412577906212526071L;

	@Id
	@GeneratedValue( strategy = GenerationType. IDENTITY   )
	int Id;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhone_no() {
		return Phone_no;
	}

	public void setPhone_no(String phone_no) {
		Phone_no = phone_no;
	}

	String Name;
	
	@Column(name = "phoneNo")
	String Phone_no;
}
