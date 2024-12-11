import java.util.*;
 
public class IncomeTaxCalculator {
 
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  final double TAX_RATE_ABOVE_20K = 0.1;
	      final double TAX_RATE_ABOVE_40K = 0.2;
	      final double TAX_RATE_ABOVE_60K = 0.3;
	      
	      int taxableIncome;
	      double taxPayable;
	      
	      System.out.print("Enter the taxable income: $");
	      taxableIncome = input.nextInt();
	      if(taxableIncome <= 20000) {
	    	  taxPayable = 0.0;
	      } else if(taxableIncome <= 40000) {
	    	  taxPayable = TAX_RATE_ABOVE_20K * (taxableIncome-20000);
	    	  
	      } else if(taxableIncome <= 60000) {
	    	  taxPayable = (TAX_RATE_ABOVE_40K * (taxableIncome-40000)+(TAX_RATE_ABOVE_20K*20000));
	    	  
	      } else {
	    	  taxPayable = (TAX_RATE_ABOVE_60K * (taxableIncome-60000)+(TAX_RATE_ABOVE_20K*20000)+((TAX_RATE_ABOVE_40K*20000)));
	      }
	      System.out.printf("The income tax payable is: $%.2f",taxPayable);
	      input.close();
	}
 
}