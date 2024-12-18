import java.util.*;

public class Lab403 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fullName;
		String firstName;
		
		System.out.println("Please enter your name, seperated by a space.");
		System.out.print(":");
		fullName = input.nextLine();
		
		int space = fullName.indexOf(" "); // find space
		firstName = fullName.substring(0,space); // keep firstNane
		
		//System.out.println(firstName);
		System.out.println(abbreviatName(fullName)+firstName);
		
		
		input.close();
		
		
	}//end main
	
	public static String abbreviatName(String fName) {
		String initaiLetter="";
		
		for(int i=0;i<fName.length();i++) {
			if(fName.charAt(i)==' ') {
				initaiLetter = (initaiLetter+fName.charAt(i+1)).toUpperCase();
				initaiLetter = initaiLetter+".";
			}
			
		}
		return initaiLetter;
	}

}
