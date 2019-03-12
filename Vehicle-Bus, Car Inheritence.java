import java.util.Scanner;
class lab7p1 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter RegNumber");
        int regNumber = input.nextInt();
        System.out.println("Enter Mileage");
        double mileage = input.nextInt();
        System.out.println("Enter Color");
        String color = input.next();
        System.out.println("EnterOwnerName");
        String ownerName = input.next();
        System.out.println("Enter the Vehicle type");
        System.out.println("1.Bus\n2.Car");
        int choice = input.nextInt();
        if(choice == 1) {

            System.out.println("Enter RouteNumber:");
            int routeNumber = input.nextInt();
            Bus bus = new Bus(regNumber, mileage, color, ownerName, routeNumber);
            bus.showData();
        }

        else if(choice == 2) {

            System.out.println("Enter Manufacturing Name:");
            String  manufactName = input.next();
            Car car = new Car(regNumber, mileage, color, ownerName, manufactName);
            car.showData();
        }
    }
}

class Vehicle {

    protected int regNumber;
    protected double mileage;
    protected String color, ownerName;

    Vehicle(int regNumber, double mileage, String color,String ownerName) {

        this.regNumber = regNumber;
        this.mileage = mileage;
        this.color = color;
        this.ownerName = ownerName;

    }

    void showData() {

        System.out.println("This is a vehicle class");
    }
}

class Bus extends Vehicle {
    private int routeNumber;

    Bus(int regNumber, double mileage, String color, String ownerName, int routeNumber) {

        super(regNumber, mileage, color, ownerName);
        this.routeNumber = routeNumber;
    }

    void showData() {
        System.out.println("===============Bus details===============");
        super.showData();
        System.out.println("RegNumber: "+this.regNumber);
        System.out.println("Mileage: "+this.mileage);
        System.out.println("Color: "+this.color);
        System.out.println("OwnerName: "+this.ownerName);
        System.out.println("RouteNumber "+this.routeNumber);
        System.out.println("\n");

    }
}

class Car extends Vehicle {
    private String manufactName;

    Car(int regNumber, double mileage, String color, String ownerName, String manufactName) {

        super(regNumber, mileage, color, ownerName);
        this.manufactName = manufactName;
    }

    void showData() {
        super.showData();
        System.out.println("===============Car details===============");
        System.out.println("RegNumber: "+this.regNumber);
        System.out.println("Mileage: "+this.mileage);
        System.out.println("Color: "+this.color);
        System.out.println("OwnerName: "+this.ownerName);
        System.out.println("ManufactNumber "+this.manufactName);
        System.out.println("\n");
    }
}
