
import java.util.*;
public class TestProductInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Product Pdetail = new Product(); 
		
		
		System.out.print("Enter Product Name: ");
		String Pdetailname = scan.nextLine();
		System.out.print("Enter Product price: ");
		Double Pdetailprice = scan.nextDouble();
		System.out.print("Enter VAT rate (%): ");
		Double PdetailVAT = scan.nextDouble();
		
		Pdetail.setProductdetails(Pdetailname, Pdetailprice, PdetailVAT);
		System.out.println("");
		Pdetail.displayProductDetails();
		
		scan.close();
	}

}
