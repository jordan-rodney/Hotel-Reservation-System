package model;

public abstract class Room {
	protected int roomNumber;
	private double pricePerNight;
	protected String floor;
	
	public Room(int roomNumber, double pricePerNight, String floor) {
		this.roomNumber = roomNumber;
		this.pricePerNight = pricePerNight;
		this.floor = floor;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public double getPricePerNight() {
		return pricePerNight;
	}
	
	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	
	public String getFloor() {
		return floor;
	}
	
	public abstract String getRoomType();
	
	@Override
	public String toString() {
		return "Room [Number: " + roomNumber + " (" + getRoomType() + "), Price per Night: " + pricePerNight + ", Floor: " + floor + "]";
	}
}
