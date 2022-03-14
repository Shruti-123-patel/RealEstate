package com.Products;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Hospital {
	@Id
	private int owner_id;
	private int price;
	@Column(length = 7)
	private int pincode;
	@Column(length = 20)
	private String city_name;
	@Column(length = 25)
	private String address_line_1;
	@Column(length = 30)
	private String address_line_2;
	@Lob
	private byte[] image_1;
	@Lob
	private byte[] image_2;
	@Lob
	private byte[] image_3;
//	Different
	private int no_of_genral_room;
	private int ICU;
	private int chambers;
	private int OT_facility;
	private boolean Lift_facility;

	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hospital(int owner_id, int price, int pincode, String city_name, String address_line_1,
			String address_line_2, byte[] image_1, byte[] image_2, byte[] image_3, int no_of_genral_room, int iCU,
			int chambers, int oT_facility, boolean lift_facility) {
		super();
		this.owner_id = owner_id;
		this.price = price;
		this.pincode = pincode;
		this.city_name = city_name;
		this.address_line_1 = address_line_1;
		this.address_line_2 = address_line_2;
		this.image_1 = image_1;
		this.image_2 = image_2;
		this.image_3 = image_3;
		this.no_of_genral_room = no_of_genral_room;
		ICU = iCU;
		this.chambers = chambers;
		OT_facility = oT_facility;
		Lift_facility = lift_facility;
	}

	public int getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public String getAddress_line_1() {
		return address_line_1;
	}

	public void setAddress_line_1(String address_line_1) {
		this.address_line_1 = address_line_1;
	}

	public String getAddress_line_2() {
		return address_line_2;
	}

	public void setAddress_line_2(String address_line_2) {
		this.address_line_2 = address_line_2;
	}

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

	public int getNo_of_genral_room() {
		return no_of_genral_room;
	}

	public void setNo_of_genral_room(int no_of_genral_room) {
		this.no_of_genral_room = no_of_genral_room;
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

	public int getOT_facility() {
		return OT_facility;
	}

	public void setOT_facility(int oT_facility) {
		OT_facility = oT_facility;
	}

	public boolean isLift_facility() {
		return Lift_facility;
	}

	public void setLift_facility(boolean lift_facility) {
		Lift_facility = lift_facility;
	}

}
