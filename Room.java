/**
 * @Author name: Ivaylo Georgiev
 * @Author SN: B50445548
 * @Purpose: Project || - "Online hotel booking system"
 */

import java.util.ArrayList;
import java.util.List;

public class Room {

	//Private variables representing the beds in a room as list and their type as follows, vacant or occupied.
	private List<Bed> beds = new ArrayList<Bed>();
	private boolean vacant = true;

	//Set method for the beds list through which we will set values to the list.
	public void setBeds(List<Bed> beds) {
		this.beds = beds;
	}
	
	//Get method for the beds list allowing us to use values stored in the beds list.
	public List<Bed> getBeds() {
		return beds;
	}

	//Creating a method for adding number of beds and their size to the list of beds.
	public void addBeds(int bedNum, String bedSize) {
		for (int i = 0; i < bedNum; i++) {
			Bed b = new Bed(bedSize);
			this.beds.add(b);
		}
	}
	
	//Boolean set method.
	public void setVacant(boolean vacant) {
		this.vacant = vacant;
	}
	
	//Boolean get method.
	public boolean getVacant() {
		return vacant;
	}

	//Method for representing the occupancy of the single beds as well as we will use it to set the number of single beds in a room.
	public int getNumSingle() {
		int count = 0;
		for (Bed b : beds) {
			if (b.getSize() == Bed.SINGLE) {
				count++;
			}
		}
		return count;
	}

	//Method for getting the number of double beds in a room.
	public int getNumDouble() {
		int count = 0;
		for (Bed b : beds) {
			if (b.getSize() == Bed.DOUBLE) {
				count++;
			}
		}
		return count;
	}

	//In order to represent the occupancy of the double beds we need to do it in separate method with cout+2 instead of +1.
	public int doubleOccupancy() {
		int count = 0;
		for (Bed b : beds) {
			if (b.getSize() == Bed.DOUBLE) {
				count += 2;
			}
		}
		return count;
	}
}
