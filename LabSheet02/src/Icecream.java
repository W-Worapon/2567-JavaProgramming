import javax.swing.*;
 
 
public class Icecream {
 
	public static void main(String[] args) {
		final int VANILLA = 10;
		final int CHOCOLATE = 15;
		final int TOPPING = 5;
		
			int price;
			String iceCream;
			
			String strinput = JOptionPane.showInputDialog(null,"[1] Vanilla Flavor 10 B."
			+ "\n[2] Chocolate Flavor 15 B."
			+"\nPress number to choose flavor:","Input", JOptionPane.QUESTION_MESSAGE);
			int input = Integer.parseInt(strinput);
			 	
				price = (input == 1) ? VANILLA : (input == 2) ? CHOCOLATE : 0;
	            iceCream = (input == 1) ? "Vanilla" : (input == 2) ? "Chocolate" : "Chocolate";
			
			
			while(input != 1 && input != 2){
		    JOptionPane.showMessageDialog(null,"ERROR: Wrong choice!"
			+"\nTry again...","ERROR", JOptionPane.ERROR_MESSAGE);
		    strinput = JOptionPane.showInputDialog(null,"[1] Vanilla Flavor 10 B."
			+ "\n[2] Chocolate Flavor 15 B."
			+"\nPress number to choose flavor:","Input", JOptionPane.QUESTION_MESSAGE);
			 input = Integer.parseInt(strinput);
			
			 	price = (input == 1) ? VANILLA : (input == 2) ? CHOCOLATE : 0;
	            iceCream = (input == 1) ? "Vanilla" : (input == 2) ? "Chocolate" : "Chocolate";
			}
			
			int topping = JOptionPane.showConfirmDialog(null,"Do you want to add topping?",
					"Topping", JOptionPane.YES_NO_OPTION);
			
			int toppingPrice = (topping == JOptionPane.YES_OPTION) ? TOPPING : 0;
 
	        int totalPrice = price + toppingPrice;
 
	        String toppingWith = (toppingPrice > 0) ? "with topping" : "no topping";
	        
	        
	        JOptionPane.showMessageDialog(null,
	        "You choose " + iceCream +" Flavor"+
	        "\nAnd " + toppingWith
	        + "\nTotal price = " + totalPrice + " baht.");
	        
	        
	}
 
}