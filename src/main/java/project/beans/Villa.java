package project.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "villa")
public class Villa extends Product implements Serializable {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	int bedrooms;

	String name;

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	String description;

	public int getBedrooms() {
		return bedrooms;
	}

	public void setBedrooms(int bed) {
		bedrooms = bed;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String des) {
		description = des;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floor) {
		floors = floor;
	}

	public int getNoSwimmingPool() {
		return noSwimmingPool;
	}

	public void setNoSwimmingPool(int noSwimmingPool) {
		this.noSwimmingPool = noSwimmingPool;
	}

	public ownerDetails getOwner() {
		return owner;
	}

	public void setOwner(ownerDetails owner) {
		this.owner = owner;
	}

	int floors;
	int noSwimmingPool;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ownerId")
	ownerDetails owner;

	int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	private String img;

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
}
