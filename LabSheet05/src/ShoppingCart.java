
import javax.swing.*;

public class ShoppingCart {

	public static void main(String[] args) {
		//call method displayCartItemAndTotal
		displayCartandTotal("Apple",10.5,"Banana",5.75,"Orange",7.3);
		displayCartandTotal("Milk",20.0,"Bread",15.0);
		displayCartandTotal();
	}
	
	
	public static void displayCartandTotal(Object... items) {
		if(items.length ==0) {
			System.out.println("No items in the cart.");
			return;
		}
		System.out.println("Items in the cart:");
		for(int i = 0;i<items.length;i+=2) {
			String itemName = (String)items[i];
			double itemPrice = (double)items[i+1];
			
			JOptionPane.showMessageDialog(null, 
					"- "+itemName +
					": $"+itemPrice);
			
			System.out.printf("- %s: $%.2f%n",itemName,itemPrice);
		}
		System.out.println();
	}
}
