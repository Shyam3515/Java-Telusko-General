package general;
//Static variables should be called with class name[best to use];
//You cannot call non-static with class name, u should use obj;
// static is available to all methods;
class Mobile{
	//these are instance vars
	String brand;
	int price;
	static String name;
	
	public void show() {
		System.out.println(brand+" : "+ name);
	}
	
}


public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile obj =new Mobile();
		obj.brand = "OPPO";
		obj.price = 30000;
		//obj.name = "reno";

		Mobile obj1 =new Mobile();
		obj1.brand = "OPPO";
		obj1.price = 30000;
		//obj1.name="reno";
		//static variables will be changed for for every object if we try to call them with object,by assigning some value;
		obj1.name = "phone";
//		Mobile.name = "Reno8";
		obj.show();
		obj1.show();

	}

}
