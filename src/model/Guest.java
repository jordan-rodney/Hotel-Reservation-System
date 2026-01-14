package model;

public class Guest {
	private static int nextID = 1000;
	private int guestID;
	private String name;
	private String phone;
	private String address;
	private String email;
	
	public Guest(String name, String phone, String address, String email) {
		this.guestID = nextID++;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}
	
	public int getGuestID() {
		return guestID;
	}
	
	public void setGuestID(int guestID) {
		this.guestID = guestID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
