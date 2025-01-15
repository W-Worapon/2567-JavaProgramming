import java.util.*;
public class Lab503 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] number = new int[7];
        int count = 0;
        String oddnumberList = "";
 
        for (int i = 0;i<number.length;i++) {
            System.out.print("Input number " +(i+1)+ " : ");
            number[i] = input.nextInt();
 
        }
   
        System.out.println();
 
        for (int _number : number)
        {
            if (_number %2 !=0)
            {
                count++;
                oddnumberList += _number + " ";
            }
        }
 
        System.out.println("There are "+count+" of odd number.");
        System.out.println("List of odd number : " + oddnumberList);
        input.close();
 
    }
 
 
}