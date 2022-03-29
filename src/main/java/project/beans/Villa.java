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

	int Bedrooms;

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	String Description;

	public int getBedrooms() {
		return Bedrooms;
	}

	public void setBedrooms(int bedrooms) {
		Bedrooms = bedrooms;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getFloors() {
		return Floors;
	}

	public void setFloors(int floors) {
		Floors = floors;
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

	int Floors;
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
	@Lob
    byte[] img;

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
}
