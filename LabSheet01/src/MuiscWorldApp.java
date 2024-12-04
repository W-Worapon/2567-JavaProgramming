import javax.swing.JOptionPane;


public class MuiscWorldApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cdId = JOptionPane.showInputDialog(null, "This program calculates the total cost of a CD order"
		+"\nPlease enter the ID of the CD");
		
		String cdTitle = JOptionPane.showInputDialog(null, "Please enter the title of the CD");
		
		String strcdPrice = JOptionPane.showInputDialog(null, "Please enter the price of the CD in U.S. dollars");
		double cdPrice = Double.parseDouble(strcdPrice);
		
		String strcdQuantity = JOptionPane.showInputDialog(null, "Please enter the quantity to be purchased");
		int cdQuantity = Integer.parseInt(strcdQuantity);
		
		double cdSubtotal = cdPrice * cdQuantity;
		double cdTotal = cdSubtotal + (cdSubtotal * (6.25/100));
		
		
		String messageOutput = "Summary of the transaction:"+"\n"+"\nCD ID: "+cdId+"\nCD Title: "+cdTitle
				+"\nCD Unit Price: $"+cdPrice+"\nCD Quantity: "+cdQuantity+"\n"+"\nSubtotal: $"
				+cdSubtotal+"\nTax rate: 6.25%"+"\nTotal: $"+cdTotal+"\n"+"\nEnd of Program";
		JOptionPane.showMessageDialog(null, messageOutput);
		
	}

}