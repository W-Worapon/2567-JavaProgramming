
import javax.swing.JOptionPane;

public class Lab103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputtimeParking = JOptionPane.showInputDialog("Input Time Parking (minute):");
		int timeParking = Integer.parseInt(inputtimeParking);
		 int hours = timeParking / 60;
         int Minutes = timeParking % 60;
         double totalFee = (hours * 50) + (Minutes * 0.25);
         JOptionPane.showMessageDialog(null, "You parking " + hours + " Hour " + Minutes + " Minute."
         + "\nAmount to be paid is " + totalFee + " baht.");
	}

}
