import javax.swing.*;
 
public class Lab506 {
    public static void main(String[] args)
    {
        String[] message = {"Good Morning", "Good Afternoon", "Good Evening" , "Good Night"};
        String messageToOutput = "";
 
        for (String _message : message) {
            messageToOutput += "- " + _message + "\n";
        }
 
        JOptionPane.showMessageDialog(null, "The greeting words in English:"
        + "\n"
        + messageToOutput);
 
    }
}