
public class DemoCar {

	public static void main(String[] args) {
		Car car = new Car("Chevrolet","Cruze",2009,150000.0);
		
		//แสดงข้อมูลเรื่มต้น
		System.out.println("Company Name: "+car.getcompanyName());
		System.out.println("Model Name: "+car.getModelName());
		System.out.println("Year: "+car.getyear());
		System.out.println("Mileage: "+car.getmileage());
		//อัปเดต

		System.out.println("");
		
		Car updetecar = new Car("Toyota","Corolla",1785,150000.0);
		System.out.println("Update Car Details:");
		System.out.println("Company Name: "+updetecar.getcompanyName());
		System.out.println("Model Name: "+updetecar.getModelName());
		System.out.println("Year: "+updetecar.getyear());
		//error
		car.setCompanyName("Toyota");
		car.setModelName("Corolla");
		car.setYear(1885);
	}

}
