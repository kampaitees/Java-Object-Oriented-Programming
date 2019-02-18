import java.util.Scanner;
public class Stack {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int number = input.nextInt();
		stack obj = new stack(number);
		while(true) {
			System.out.println("1.Push  2.Pop  3.Display  4.Exit");
			int choice = input.nextInt();
			if(choice == 1) {
				System.out.println("Enter the element:");
				int element = input.nextInt();
				obj.push(element);
			}
			else if(choice == 2) {
				int element = obj.pop();
				System.out.println("Popped element: "+element);
			}
			else if(choice == 3) {
				obj.display();
			}
			else if(choice == 4)
				break;
		}
	}
}

class stack {
	
	int top;
	int a[];
	int k;
	stack(int n) {
		a = new int[n];
		top = -1;
		k = n;
	}
	
	void push(int element) {
		if(a[k-1] != 0)
			System.out.println("Stack is empty!!!");
		else
			a[++top] = element;
	}
	
	int pop() {
		if(top == -1) {
			System.out.println("Stac is Empty!!!");
			return 0;
		}
		else
			return a[top--];
	}

	void display() {
		for(int i = 0; i < k; i++)
			System.out.println(a[i]);
	}
}
