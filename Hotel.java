/**
 * @Author name: Ivaylo Georgiev
 * @Author SN: B50445548
 * @Purpose: Project || - "Online hotel booking system"
 */

import java.util.ArrayList;
import java.util.List;

public class Hotel {

	//Creating private variables for the hotel name and number of rooms.
	public String name;
	private List<Room> rooms = new ArrayList<Room>();

	//Hotel constructor accepting only one value as a parameter,namely name.The rest of the values will be added in a separate method.
	public Hotel(String name) {
		this.name = name;
	}

	//Set method for accessing and giving a name of a hotel.
	public void setName(String name) {
		this.name = name;
	}

	//Get method in order to access the hotel's name.
	public String getName() {
		return name;
	}

	//Set method allowing us to set a value in the list.
	public void setRooms(List<Room> room) {
		this.rooms = room;
	}

	//Get method for accessing the values in the list of rooms.
	public List<Room> getRooms() {
		return rooms;
	}

	//Method which will accept 3 integer parameters representing the number of rooms and the number of single and double beds. 
	public void addRooms(int rooms, int singleBeds, int doubleBeds) {
		for (int i = 0; i < rooms; i++) {
			Room r = new Room();
			r.addBeds(singleBeds, Bed.SINGLE);
			r.addBeds(doubleBeds, Bed.DOUBLE);
			this.rooms.add(r);
		}
	}
	
	public void addRoom(int singleBeds,int doubleBeds){
		Room r = new Room();
		r.addBeds(singleBeds, Bed.SINGLE);
		r.addBeds(doubleBeds, Bed.DOUBLE);
		rooms.add(r);
	}

	//Boolean method which will return true if a room is vacant or false if the room is already occupied.
	public boolean hasVacancies() {
		for (Room r : rooms) {
			if (r.getVacant() == true) {
				return true;
			}
		}
		return false;
	}
}
