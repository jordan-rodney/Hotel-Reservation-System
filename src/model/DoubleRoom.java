package model;

public class DoubleRoom extends Room {
	public DoubleRoom(int roomNumber, double pricePerNight, String floor) {
		super(roomNumber, pricePerNight, floor);
	}
	
	public String getRoomType() {
		return "Double";
	}
}
