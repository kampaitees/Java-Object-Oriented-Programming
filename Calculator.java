import java.util.Scanner;
public class example {
	public static void main(String args[]) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		float num1 = input.nextFloat();
		float num2 = input.nextFloat();
		Calculator obj = new Calculator(num1, num2);
		System.out.println("Addition = "+obj.add());
		System.out.println("Subtraction = "+obj.subtract());
		System.out.println("Multiplication = "+obj.multiply());
		System.out.println("Division = "+obj.divide());
	}
}

class Calculator {
	
	float num1, num2, result;
	
	Calculator(float num1, float num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	float add() {
		result = num1 + num2;
		return result;
	}
	
	float subtract()  {
		result = num1 - num2;
		return result;
	}
	
	float multiply() {
		result = num1 * num2;
		return result;
	}
	
	float divide() {
		result = num1 / num2;
		return result;
	}
}
		
