import java.util.*;
 
public class Lab505 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] listNumber = {78, 36, 58, 41, 25, 92 ,75};
        int arrayIndex;
 
        System.out.print("Input index of array : ");
        arrayIndex = input.nextInt();
        while (arrayIndex < 0 || arrayIndex > listNumber.length-1)
        {
            System.out.print("Input index of array, again : ");
            arrayIndex = input.nextInt();  
        }
        System.out.println();
 
        for (int i = 0; i<listNumber.length;i++)
        {
            if (arrayIndex == i) {
                System.out.println("Value in current index is " + listNumber[i]);
                System.out.println((arrayIndex == (listNumber.length-1)) ? "Sorry, "
                + arrayIndex
                + " is the last index in array." : "Value in next    index is "
                + listNumber[i+1]);
            }
 
        }
        input.close();
 
    }
}