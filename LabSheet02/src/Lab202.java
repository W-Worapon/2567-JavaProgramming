import java.util.*;
 
public class Lab202 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input number : ");
		int oldnumber = input.nextInt();
		while(true) {
			System.out.print("Input number : ");
			int number = input.nextInt();
			if (number < oldnumber) {
				System.out.print("\nBYE BYE");
				break;
			}
			oldnumber = number;
        }
        
        input.close();
    }
}