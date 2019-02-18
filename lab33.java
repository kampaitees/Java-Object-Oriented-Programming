import java.util.Scanner;
class lab33 {
	public static void main(String args[]) {
		tollbooth obj = new tollbooth();
		obj.payingVehicle();
		obj.payingVehicle();
		obj.nonPayingVehicle();
		obj.display();
	}
}

class tollbooth {
	int toll;
	double tollAmount;
	tollbooth() {
		this.toll = 0;
		this.tollAmount = 0;
	}
	void payingVehicle() {
		toll++;
		tollAmount += 50;	
	}
	void nonPayingVehicle() {
		toll++;	
	}
	void display() {
		System.out.println("Total number of cars are: "+toll);
		System.out.println("Total amount of cars is: "+tollAmount);
	}
}
