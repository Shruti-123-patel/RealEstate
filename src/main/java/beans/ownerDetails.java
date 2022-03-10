package beans;
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
	
	@Column(name = "name")
	String Name;
	
	@Column(name = "phoneNo")
	String Phone_no;
}
