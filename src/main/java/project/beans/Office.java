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

	int conferenceRooms;

	int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	String description;

	private String img;

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	String name;

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public int getConferenceRooms() {
		return conferenceRooms;
	}

	public void setConferenceRooms(int conference) {
		conferenceRooms = conference;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String des) {
		description = des;
	}

	public int getWaitingRooms() {
		return waitingRooms;
	}

	public void setWaitingRooms(int waitingRooms) {
		waitingRooms = waitingRooms;
	}

	public ownerDetails getOwner() {
		return owner;
	}

	public void setOwner(ownerDetails owner) {
		this.owner = owner;
	}

	int waitingRooms;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ownerId")
	ownerDetails owner;
}
