
public class Product {
		private String name;
		private double price;
		private double vatRate;
		
		
		public void setProductdetails(String nameproduct,double priceproduct,double vatRateproduct) {
			name = nameproduct;
			price = priceproduct;
			vatRate = vatRateproduct;
		}
		public double calculatePrice() {
			double vatRatetax = price + (price*vatRate/100);
			return vatRatetax;
		}
		public void displayProductDetails() {
			System.out.println("Product Detail:");
			System.out.println("Product Name: "+name);
			System.out.println("Price (Before VAT): "+price);
			System.out.println("Price (Before VAT): "+calculatePrice());
		}
}
