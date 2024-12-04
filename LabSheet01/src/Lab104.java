import javax.swing.JOptionPane;

public class Lab104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String messageWelcome = "Welcome to the payroll application";	
		JOptionPane.showMessageDialog(null, messageWelcome, "Message", JOptionPane.INFORMATION_MESSAGE);
		
		String employeeName = JOptionPane.showInputDialog(null, "Enter employee name");
		
		String hoursinputWorked = JOptionPane.showInputDialog(null, "Enter total hours for this employee.");
		double hoursWorked = Double.parseDouble(hoursinputWorked);
		
		double grossEarning = hoursWorked * 7.5;
		double tax = grossEarning * 0.15;
		double netEarnings = grossEarning - tax;
		
		
		String messageOutput = "Employee name: "+employeeName+"\nHours worked: "+hoursWorked+"\nHourly wage: $ 7.5"+"\nGross earnings: $ "+
		grossEarning+"\nTax rate: 0.15"+"\nTax: $ "+tax+"\nNet earnings: $ "+netEarnings;
		JOptionPane.showMessageDialog(null, messageOutput);
	}

}