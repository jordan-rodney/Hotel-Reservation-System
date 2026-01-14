package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation {
	private Guest guest;
	private Room room;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	public Reservation(Guest guest, Room room, LocalDate checkIn, LocalDate checkOut) {
		this.guest = guest;
		this.room = room;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public Guest getGuest() {
		return guest;
	}
	
	public void setGuest(Guest guest) {
		this.guest = guest;
	}
	
	public Room getRoom() {
		return room;
	}
	
	public void setRoom(Room room) {
		this.room = room;
	}
	
	public LocalDate getCheckIn() {
		return checkIn;
	}
	
	public void setCheckIn(LocalDate checkIn) {
		this.checkIn = checkIn;
	}
	
	public LocalDate getCheckOut() {
		return checkOut;
	}
	
	public void setCheckOut(LocalDate checkOut) {
		this.checkOut = checkOut;
	}
	
	public long getTotalNights() {
		return ChronoUnit.DAYS.between(checkIn, checkOut);
	}
	
	public double calculateCost() {
		return getTotalNights() * room.getPricePerNight() * 1.13;
	}
}
