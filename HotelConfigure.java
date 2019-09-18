/**
 * @Author name: Ivaylo Georgiev
 * @Author SN: B50445548
 * @Purpose: Project || - "Online hotel booking system"
 */

import java.util.Scanner;

public class HotelConfigure {

	public static void main(String[] args) {
		
		//Importing scanner in order to be able to input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the name of the hotel: ");
		Hotel h = new Hotel(keyboard.nextLine());

		int rooms;
		System.out.print("Enter number of rooms: ");
		rooms = keyboard.nextInt();
		
		int singleBeds = 0;
		int doubleBeds = 0;
		
		for (int i = 0; i < rooms; i++) {
			System.out.print("Choose number of single beds for Room " + (i + 1) + ": ");
			singleBeds = keyboard.nextInt();
			System.out.print("Choose number of double beds for Room " + (i + 1) + ": ");
			doubleBeds = keyboard.nextInt();
			h.addRoom(singleBeds, doubleBeds);
		}
		HotelReport.hotelReport(h);
		
		keyboard.close();
	}
}