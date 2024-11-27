import java.util.*;
import java.text.*;
public class JavaExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//กำหนด object ในการรับข้อมูลทาง keyboard
		Scanner input = new Scanner(System.in);
		//กำหนด object ในการจัดรูปแบบตัวเลข
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//รับและแสดงผลและรับข้อมูลชื่อสินค้า
		System.out.print("Input product name: ");
		String productName = input.nextLine();
		//แสดงและรับข้อมูลจำนวนสินค้า
		System.out.print("Input product unit: ");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit: ");
		float productPrice = input.nextFloat();
		System.out.println(); //เว้น 1 บรรทัด
		//คำนวณหาผลรวมของสินค้า
		float totalPriceofProduct = productUnit * productPrice;
		System.out.println("Total Price is "+frm.format(totalPriceofProduct)+" "+ "Baht.");
		//คำนวณภาษี +7%
		float totalwithVat = totalPriceofProduct + (totalPriceofProduct*7/100);
		System.out.print("Add VAT 7% is "+" "+frm.format(totalwithVat)+" "+"Baht.");
		System.out.println();
		String frmtotalwithVat = String.format("%,.2f",totalwithVat);
		System.out.println("Output using String.format");
		System.out.print("Add VAT 7% is "+frmtotalwithVat+"Baht.");
		System.out.println();
		System.out.println("Output using printf");
		System.out.printf("Add VAT 7%  is %,.2f ", totalwithVat);
		
		
		input.close();
	}

}