package project.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "residentialBuilding")
public class ResidentialBuilding extends Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	int Bedrooms;
	String Description;
	String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public ownerDetails getOwner() {
		return owner;
	}

	public void setOwner(ownerDetails owner) {
		this.owner = owner;
	}

	int Floors;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ownerId", unique = true)
	ownerDetails owner;
}
