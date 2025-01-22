
public class Rectangle {
	//เขียนแบบที่1
	private float length;
	private float width;
	
	//Default Constructor
	Rectangle(){
		length = 1.0f;
		width = 1.0f;
	}
	//เขียนแบบที่2
	/*private float length=1.0f;
	private float width=1.0f;
	
	//Default Constructor
	Rectangle(){}*/
	
	//Paramiterize Constructor
	Rectangle(float length,float width) {
		this.length = length;
		this.width = width;
	}
	//Getter and setter method
	public float getLength() {
		return this.length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return this.width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	//method to calculate area
	public double getArea() {
		return this.length * this.width;
	}
	//method to perimeter
	public double getPerimeter() {
		return 2 * (this.length + this.width);
	}
	
	//method to display
	public String showData() {
		return "Rectangle[length= " + this.length+ ",width = "+this.width+"]";
	}
	
	//method to display using toString()
	public String toString() {
		return "Rectangle[length= " + this.length+ ",width = "+this.width+"]";
	}
	
	
	
}
