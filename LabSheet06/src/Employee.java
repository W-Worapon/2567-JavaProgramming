
public class Employee {
	//private attribute
	private String name;
	private int hourWorked;
	private double hourlyRate;
	
	//Method to set employee details
	public void setEmployeeDetails(String empName ,int hours,double rate) {
		name = empName;
		hourWorked = hours;
		hourlyRate = rate;
		
	}
	
	//method to calculate salary
	public double calculateSalary() {
		double salary = hourWorked * hourlyRate;
		if(hourWorked >40) {
			double bonus = salary * 0.10; //bonus is 10% of salary
			salary +=bonus;
		}
		return salary;
	}
	//method to display employee details
	public void displayEmployeeDetails() {
		System.out.println("Name: "+ name);
		System.out.println("Hours Worked: "+ hourWorked);
		System.out.println("Hourly Rate: "+ hourlyRate);
		System.out.println("Total Salary: "+ calculateSalary());
	}
	
}
