import java.util.Scanner;
public class experiment {
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the numbers:");
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	System.out.println("Enter your name:");
	String name = input.next();
	exp obj = new exp();
	exp obj1 = new exp(num1);
	exp obj2 = new exp(num1, num2);
	exp obj3 = new exp(num1, num2, name);
	obj.display();
	obj1.display();
	obj2.display();
	obj3.display();	
	}
}
	
class exp {
	int n1;
	int n2;
	String name;
	
	exp() {
		int n1 = 5;
		int n2 = 4;
	}
	
	exp(int num1) {
		int n1 = num1;
		//int n2 = ;
		name = "Rajesh";
	}
	exp(int num1, int num2) {
		n1 = num1;
		n2 = num2;
		
	}
	exp(int num1, int num2, String name) {
		n1 = num1;
		n2 = num2;
		this.name = name;
	}
	
	int add() {
		return n1+n2;
	}
	void display() {
		int value = add();
		System.out.println("Hi! "+name+ ", your addition is: "+add());
	}
}
	
