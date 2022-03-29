package project.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "office")
public class Office extends Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7234718489649270736L;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	int ConferenceRooms;

	int price;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	String Description;

	String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getConferenceRooms() {
		return ConferenceRooms;
	}

	public void setConferenceRooms(int conferenceRooms) {
		ConferenceRooms = conferenceRooms;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getWaitingRooms() {
		return WaitingRooms;
	}

	public void setWaitingRooms(int waitingRooms) {
		WaitingRooms = waitingRooms;
	}

	public ownerDetails getOwner() {
		return owner;
	}

	public void setOwner(ownerDetails owner) {
		this.owner = owner;
	}

	int WaitingRooms;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ownerId")
	ownerDetails owner;
}
