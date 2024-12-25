import javax.swing.*;
 
public class Lab402 {
    public static void main(String[] args) {
        
        //input
        int normalyear = Integer.parseInt(JOptionPane.showInputDialog(null, "Input year:"));
 
        
        if (checkYear(normalyear) == false) {
            while (true) {
            	normalyear = Integer.parseInt(JOptionPane.showInputDialog(null, "Input year:"));
                if (checkYear(normalyear) == false) {
                    break;
                }
            }
        }
        
        if (isLeapYear(normalyear) == true) {
            JOptionPane.showMessageDialog(null, normalyear + " is Leap year.");
        }
        else {
            JOptionPane.showMessageDialog(null, normalyear + " is NOT Leap year.");
        }
 
    }
    
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        else if (year % 100 == 0 && year % 400 == 0) {
            return true;
        }
 
        return false;
 
    }
    
    public static boolean checkYear(int yearToCheck) {
        if (yearToCheck >= 1000 && yearToCheck <= 3000) {
                
            return true;
        }
        return false;
    }
 
}