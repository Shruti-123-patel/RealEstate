package beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Orders")
public class orders implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8268429960865328308L;

	@Id
	@GeneratedValue( strategy = GenerationType. IDENTITY   )
	int Id;
	
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name = "custId", unique= true)
	Customer customer;
	
	@Column(name = "productId")
	int productId;
	
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name = "productTypeId", unique= true)
	availableProduct product;
	
	@Column(name = "date")
	Date date;

}
