import java.util.*;
import java.text.*;
public class Lab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		System.out.print("Input Product Name    : ");
		String productName = input.nextLine();
		//แสดงและรับข้อมูลจำนวนสินค้า
		System.out.print("Input Product Unit    : ");
		int productUnit = input.nextInt();
		System.out.print("Input Price per unit  : ");
		float productPrice = input.nextFloat();
		System.out.println("--------------------------------------------");
		float totalPriceofProduct = productUnit * productPrice;
		System.out.println("Total Price is "+frm.format(totalPriceofProduct)+" "+ "baht.");
		System.out.print("--------------------------------------------");
		System.out.print("\nHow many discount (%) : ");
		int discount = input.nextInt();
		System.out.println("--------------------------------------------");
		float Discounttotal = totalPriceofProduct - (totalPriceofProduct*discount/100);
		float totalPriceallDiscounttotal = totalPriceofProduct - Discounttotal;
		System.out.println("Discount from"+" "+discount+"%"+"       "+frm.format(totalPriceallDiscounttotal)+" baht.");
		System.out.print("Amount to be paid "+"      "+frm.format(Discounttotal)+" "+ "baht.");
		
	}

}
