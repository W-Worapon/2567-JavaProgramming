import java.util.*;
public class Lab306 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        int Nichisentencecount = 0;
 
        System.out.print("Message: ");
        String input = scan.nextLine();
        if (input.toLowerCase().indexOf("nichi")>=0) {
        	Nichisentencecount++;
 
        }
       
        if (Nichisentencecount > 0) {
            System.out.println("Nichi is a sentence");
        }
        else {
            System.out.println(input);
        }
 
 
       
        scan.close();
 
    }
}