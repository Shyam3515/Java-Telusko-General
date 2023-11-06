package general;

class Calculator{
	// Method OverLoading is having different methods with same name but with  
	// different parameters and it's types
	public int add(int n1,int n2) {
		int r = n1+n2;
		return r;
		
	}
	public int add(double n1,int n2, int n3) {
		double r = n1+n2+n3;
		return (int) r;
		
	}
	
	public String getMePen(int cost) {
		if(cost>=10) {
			return "Here is your Pen";
		}
		return "cost is more than u provided...";
	}
}

public class MethodOverload {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Programming World!");
		
		int num1=4, num2=5;
		double num3=6.5;
		Calculator calc = new Calculator();
		int res=calc.add(num1,num2);
		int res1=calc.add(num3,num2,num1);
		System.out.println("Result: "+res);
		System.out.println("Result1: "+ res1);
		System.out.println(calc.getMePen(15));
	}

}
