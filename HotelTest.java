/**
 * @Author name: Ivaylo Georgiev
 * @Author SN: B50445548
 * @Purpose: Project || - "Online hotel booking system"
 */

public class HotelTest {

	public static void main(String[] args) {
		// Creating a new hotel object.
		Hotel h = new Hotel("Lazur");

		// Calling the addRooms method in the Room class to add rooms and single and double beds to it
		h.addRooms(2, 2, 2);

		HotelReport.hotelReport(h);
		occupancy(h);
	}

	//Calculating the occupancy of a hotel in this method.
	public static void occupancy(Hotel h) {
		int occupancy = 0;
		for (int i = 0; i < h.getRooms().size(); i++) {
			occupancy += h.getRooms().get(i).getNumSingle() + h.getRooms().get(i).doubleOccupancy();
		}
		System.out.println("\nThe maximum occupancy is: " + occupancy + " people");
	}
}
