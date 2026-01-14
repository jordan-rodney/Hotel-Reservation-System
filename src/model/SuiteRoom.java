package model;

public class SuiteRoom extends Room {
	public SuiteRoom(int roomNumber, double pricePerNight, String floor) {
		super(roomNumber, pricePerNight, floor);
	}
	
	public String getRoomType() {
		return "Suite";
	}
}