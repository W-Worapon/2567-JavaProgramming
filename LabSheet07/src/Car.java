
public class Car {
	private String companyName;
	private String modelName;
	private int year;
	private double mileage;
	
	//Default Constructor
	Car(){
		companyName = "Unknown";
		modelName = "Unknown";
		year = 2000;
		mileage = 0.0;
		//this("Unknown","Unknown",2000,0.0);
	}
	
	//Parameterize Constructor
	Car(String companyName,String modelName,int year,double mileage) {
		this.companyName = companyName;
		this.modelName = modelName;
		//Default ปีที่ผลิต 2000 หาค่าที่ใส่ไม่ถูกต้อง
		this.year = year <1886 ? 2000:year;
		this.mileage = mileage;
	}
	
	//getters and setter method()
	public void setCompanyName(String companyName) {
		if(companyName != null && !companyName.trim().isEmpty()) {
			//this.companyName = companyName;
			System.out.println("Error: Invalid company name!");
			
		}else {
			//System.out.println("Error: Invalid company name");
			this.companyName = companyName;
		}
	}
	public void setModelName(String modelName) {
		if(modelName != null && !modelName.trim().isEmpty()) {
			//this.modelName = modelName;
			System.out.println("Error: Invalid model name!");
		}else {
			//System.out.println("Error: Invalid model name");
			this.modelName = modelName;
		}
	}
	public void setYear(int year) {
		if(year > 1886) {
			this.year = year;
			
		}else {
			System.out.println("Error: Invalid year!");
		}
	}
	public String getcompanyName() {
		return this.companyName;
	}
	public String getModelName() {
		return this.modelName;
	}
	public int getyear() {
		return this.year;
	}
	public double getmileage() {
		return this.mileage;
	}
}
