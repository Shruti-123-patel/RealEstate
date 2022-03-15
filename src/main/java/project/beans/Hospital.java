package project.beans;

import java.io.Serializable;

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
@Table(name = "hospital")
public class Hospital extends Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7234718489649270736L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	int GeneralRooms;

	String Description;

	int OT;

	int ICU;

	int chambers;

	String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getGeneralRooms() {
		return GeneralRooms;
	}

	public void setGeneralRooms(int generalRooms) {
		GeneralRooms = generalRooms;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getOT() {
		return OT;
	}

	public void setOT(int oT) {
		OT = oT;
	}

	public int getICU() {
		return ICU;
	}

	public void setICU(int iCU) {
		ICU = iCU;
	}

	public int getChambers() {
		return chambers;
	}

	public void setChambers(int chambers) {
		this.chambers = chambers;
	}

	public ownerDetails getOwner() {
		return owner;
	}

	public void setOwner(ownerDetails owner) {
		this.owner = owner;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ownerId", unique = true)
	ownerDetails owner;
}
