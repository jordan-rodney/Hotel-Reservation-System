package model;

public class SingleRoom extends Room {
	public SingleRoom(int roomNumber, double pricePerNight, String floor) {
		super(roomNumber, pricePerNight, floor);
	}
	
	public String getRoomType() {
		return "Single";
	}
}
