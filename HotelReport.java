/**
 * @Author name: Ivaylo Georgiev
 * @Author SN: B50445548
 * @Purpose: Project || - "Online hotel booking system"
 */

public class HotelReport {

	/*
	 * Creating a simple report method that whenever you pass him a hotel object
	 * will give a full detailed report about the name of the hotel,the rooms it
	 * has,the number of beds it has and there size.Then for each room it will
	 * give a message if it is vacant or not
	 */

	public static void hotelReport(Hotel h) {
		System.out.println("Hotel name: " + h.getName());
		System.out.println("Number of rooms: " + h.getRooms().size());
		for (int i = 0; i < h.getRooms().size(); i++) {
			System.out.println("\nRoom " + (i + 1) + ": " + h.getRooms().get(i).getBeds().size() + " beds."
					+ "\nSingle Beds: " + h.getRooms().get(i).getNumSingle() + "\t Double Beds: "
					+ h.getRooms().get(i).getNumDouble() + "\nVacant: " + h.getRooms().get(i).getVacant());
		}
	}
}
