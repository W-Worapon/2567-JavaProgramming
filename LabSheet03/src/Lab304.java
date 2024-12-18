import java.util.*;
 
public class Lab304 {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Full Name: ");
		String fullName = input.nextLine();
		
		String firstName, lastName;
		
		
		if(fullName.contains(" ")) {
			firstName = fullName.substring(0,fullName.indexOf(" ")).toUpperCase();
			lastName = fullName.substring(fullName.indexOf(" ")+1,fullName.length()).toLowerCase();
			System.out.println("First Name: "+firstName);
			System.out.println("Last Name: "+lastName);
		}else {
			System.out.println("Incorrect Name");
		}
 
		
		input.close();
	}
 
}