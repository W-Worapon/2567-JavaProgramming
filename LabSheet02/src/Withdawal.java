import javax.swing.*;
import java.util.*;

public class Withdawal {

	public static void main(String[] args) {	
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		
		//System.out.println(balance); ใน console
		
		//รับจำนวนเงินที่ต้องถอน
		int moneywithdraw = Integer.parseInt(JOptionPane.showInputDialog("Your balance : " + balance+"\nInput money to withdraw:"));
		
		//ตรวจสอบเงื่อนไข
		if(moneywithdraw > balance) {
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw more than balance", "ERROR",JOptionPane.ERROR_MESSAGE);
		}else if(moneywithdraw > 50000) {
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw more than 50,000", "ERROR",JOptionPane.ERROR_MESSAGE);
		}else if(moneywithdraw % 100 !=0) {
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw "+(moneywithdraw%100)+" baht.", "ERROR",JOptionPane.ERROR_MESSAGE);
		}
		//ในกรณีที่ผ่านทุกเงื่อนไข
		else {
			JOptionPane.showMessageDialog(null, "You withdraw "+moneywithdraw+" baht."+
		    "\n1,000 = "+(moneywithdraw/1000)+
			"\n500 = "+((moneywithdraw%1000)/500)+
			"\n100 = "+((moneywithdraw%500)/100));
		}
		
	}

}
