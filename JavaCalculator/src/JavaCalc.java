
class Calculator {
	
	public int num1;
	public int num2;
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public static void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}
	
	public static void subtract(int num1, int num2) {
		int difference = num1 - num2;
		System.out.println(difference);
	}
	
	public static void multiply(int num1, int num2) {
		int product = num1 * num2;
		System.out.println(product);
	}
	
	public static void divide(int num1, int num2) {
		int remainder = num1 / num2;
		System.out.println(remainder);
	}
	
	public static void square(int num1) {
		int sqResult = num1 * num1;
		System.out.println(sqResult);
	}
}

public class JavaCalc {

	public static void main(String[] args) {
		
		Calculator.add(3, 3);
		
		Calculator.subtract(3, 3);
		
		Calculator.multiply(3, 3);
		
		Calculator.divide(3, 3);
		
		Calculator.square(9);
		

	}

}
