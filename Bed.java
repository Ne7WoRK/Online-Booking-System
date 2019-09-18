/**
 * @Author name: Ivaylo Georgiev
 * @Author SN: B50445548
 * @Purpose: Project || - "Online hotel booking system"
 */

public class Bed {

	private String size;
	public static final String SINGLE = "Single";
	public static final String DOUBLE = "Double";

	// Creating a constructor of type bed in order to be able to construct new
	// objects of type bed and use them in other classes
	public Bed(String size) {
		this.size = size;
	}

	// Creating a set method for accessing and setting a value to the private
	// String size in the class bed.
	public void setSize(String size) {
		this.size = size;
	}

	// Get method through which we will be accessing the value of the private
	// string in class bed.
	public String getSize() {
		return size;
	}
}
