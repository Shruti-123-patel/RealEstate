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
    String img;
	
	
	
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
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
