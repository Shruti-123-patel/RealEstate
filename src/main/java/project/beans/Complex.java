package project.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="complex")
public class Complex extends Product implements Serializable {
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy = GenerationType. IDENTITY   )
	int id;
	private int Shops;
	String Name;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	@Lob
	private byte[] image_1;
	@Lob
	private byte[] image_2;
	@Lob
	private byte[] image_3;
	
	public byte[] getImage_1() {
		return image_1;
	}

	public void setImage_1(byte[] image_1) {
		this.image_1 = image_1;
	}

	public byte[] getImage_2() {
		return image_2;
	}

	public void setImage_2(byte[] image_2) {
		this.image_2 = image_2;
	}

	public byte[] getImage_3() {
		return image_3;
	}

	public void setImage_3(byte[] image_3) {
		this.image_3 = image_3;
	}
	
	public int getShops() {
		return this.Shops;
	}

	public void setShops(int shops) {
		this.Shops = shops;
	}
	String Description;
	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public ownerDetails getOwner() {
		return owner;
	}

	public void setOwner(ownerDetails owner) {
		this.owner = owner;
	}

	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name = "ownerId", unique= true)
	ownerDetails owner;

	



}
