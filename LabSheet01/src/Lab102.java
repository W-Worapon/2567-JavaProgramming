
import java.util.Scanner;

public class Lab102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number of minutes: ");
		int numberMinutes = input.nextInt();
		int years = numberMinutes / 525600;
		int day = (numberMinutes % 525600) / 1440;
		System.out.println(numberMinutes+" minutes is approximately "+years +" years "+"and "+day+" days");
		
		input.close();
	}

}
