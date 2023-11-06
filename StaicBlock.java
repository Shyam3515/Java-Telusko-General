package general;

class Car{
	//these are instance vars
	String brand;
	int price;
	static String name;//static var
	
	public void show() {
		System.out.println(brand+" : "+ name);
	}
	
	static {
		name="Car";
		System.out.println("Static");
	}
	
	public Car() {
		brand="Audi";
		System.out.println("Constructor");
	}
	
	public static void show1(Car obj) {
		System.out.println(obj.brand+" : "+ obj.name);
	}
	
}

public class StaicBlock {

	public static void main(String[] args) throws ClassNotFoundException {
		//Class.forName("Car");
		Car obj =new Car();
		obj.brand = "Audi";
		obj.name = "Car";
		
		Car.show1(obj);

	}

}
