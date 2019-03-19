import java.text.DecimalFormat;
import java.util.Scanner;

class lab {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner keyboard = new Scanner(System.in);

        String firstName;
        char crustType;
        String crust;
        int inches1, inches;
        double cost = 0.0;
        final double taxRate = 0.08;
        double tax;
        double total;
        double lastTotal;
        int numberOfToppings = 0;
        int numberOfToppings2 =0;
        int numberOfToppings3;
        String toppings = "Cheese";

        System.out.println("Enter your name: " );
        firstName = keyboard.nextLine();

        double distance = 0;
        double deliveryfee = 0;

        System.out.println("Please enter 0 for deliverable\t\t 1 for eat-in:");
        int x = keyboard.nextInt();
        if(x == 0) {
            System.out.println("Please enter total distance in miles from pizza shop:");
            distance = keyboard.nextDouble();
            if (distance > 1) {
                deliveryfee = ((distance * 0.5) + 2);
                System.out.println("Your delivery fee is: $" + df.format(deliveryfee));
            } else if (distance > 0) {
                deliveryfee = 2.00;
                System.out.println("Your delivery fee is: $" + df.format(deliveryfee));
            }
        }
        else if (x == 1) {
            deliveryfee = 0;
            System.out.println("There is no delivery fee.");
        }


        System.out.println("NITK EATLAND\n" +
                "0.AC-Extra Charge=10.99$\n" +
                "1.Non-AC Charge=5$\n");
        inches1 = keyboard.nextInt();
        if (inches1 == 0 ){
            cost = 10.99; }
        else
            cost = 0;
        System.out.println("Enter the type of pizza:\n"+
                "1.Paneer Pizza 2.5$ calories=370\n" +
                "2.Babycorn Pizza 3$ calories=300\n" +
                "3.Mushroom Pizza 3.5$ calories=350\n" +
                "4.Chicken Grill Pizza 5$ calories=400\n"+
                "5.Garlic Bread 1.5$ calories=200(only sit-in)\n" +
                "6.Cheese Jalepeeno Pasta 2$ calories=250(only sit-in)\n"+
                "7.Coke 600ml 0.8$\n" +
                "8.Mountain Dew 0.8$\n" +
                "9.Chicken Grill Pizza and Coke (COMBO) 10$\n" +
                "10.Paneer Pizza and Mountain Dew (COMBO) 15$\n"
        );

        inches = keyboard.nextInt();

        if (inches == 1){
            cost += 2.5;}
        else if (inches == 2){
            cost += 3;}
        else if (inches == 3){
            cost += 3.5;}
        else if (inches == 4 ){
            cost += 5; }
        else if (inches == 5){
            cost += 1.5;}
        else if (inches == 6){
            cost += 2;}
        else if (inches == 7){
            cost += 0.8;}
        else if (inches == 8){
            cost += 0.8;}
        else if (inches == 9){
            cost += 10;}
        else if (inches == 10){
            cost += 15;}
        else if (inches != 0 && inches != 1 && inches != 2 && inches != 3 && inches != 4 && inches != 5 && inches != 6 && inches != 7 && inches != 8 && inches != 9 && inches != 10){
            System.out.println("The number you have entered is illegal, your pizza size will be set to price of normal pizza i.e 12$. " );
            cost = 4;}

        keyboard.nextLine();

        System.out.print("What type of crust do you want? (H)and-Tossed, (T)hin-crust, or (D)eep-dish (enter H, T, or D,): " );
        crustType = keyboard.nextLine().charAt(0);

        if (crustType == 'H' || crustType == 'h' ){
            crust = "Hand-Tossed";}
        else if (crustType == 'T' || crustType == 't' ){
            crust = "Thin-Crust";}
        else if (crustType == 'D' || crustType == 'd' ){
            crust = "Deep-Dish";}
        else if (crustType != 'H' && crustType != 'h' && crustType != 'T' && crustType    != 't' && crustType != 'D' && crustType != 'd' ){
            System.out.println("The crust type you have entered is illegal, your crust type will be set to hand-tossed. " );}
        crust = "Hand-Tossed";


        System.out.println("All pizzas come with cheese." );
        System.out.println("Additional toppings are $1.25 each, choose from Pepperoni or Sausage." );


        System.out.println("Do you want Pepperoni? (Y/N)" );
        numberOfToppings = keyboard.nextLine().charAt(0);
        if (numberOfToppings == 'Y' || numberOfToppings == 'y' ){
            numberOfToppings = 1;
            toppings = toppings + " and Pepperoni";}
        else{
            numberOfToppings = 0;
        }

        System.out.println("Do you want Sausage? (Y/N)" );
        numberOfToppings2 = keyboard.nextLine().charAt(0);
        if (numberOfToppings2 == 'Y' || numberOfToppings2 == 'y' ){
            numberOfToppings2 = 1;
            toppings = toppings + " and Sausage";}
        else{
            numberOfToppings2 = 0;}


        numberOfToppings3 = (numberOfToppings) + (numberOfToppings2);


        System.out.println("Enter the type of cold drink:\n"+
                "1.Pepsi 2.5$ \n" +
                "2.Sprite 3$\n" +
                "3.ThumpUp 3.5$\n");
        int y = keyboard.nextInt();
        if (y == 1){
            cost += 2.5;}
        else if (y == 2){
            cost += 3;}
        else if(y == 3){
            cost+= 3.5;
        }


        System.out.println("Enter the option for Cold or Room temperature room:\n"+
                "1.Cold temperature\n" +
                "2.Room temperature\n" );
        int z = keyboard.nextInt();
        if (z == 1){

            System.out.println("You are going to cold temperature room");}
        else if (z == 2){
            System.out.println("You are going to room temperature room");}



        if(x == 1) {
            System.out.println("Enter the type of salads:\n"+
                    "1.Onion Price 0.9$\n" +
                    "2.Carrot Price 0.65$\n"+
                    "3.Mix Salad Price 2$");
            int zPrime = keyboard.nextInt();
            if (zPrime == 1){
                cost += 0.9;}
            else if (zPrime == 2){
                cost += 0.65;}
            else if (zPrime == 3){
                cost += 2;}

        }
// Calculations
        total = (cost) + (numberOfToppings3 * 1.25) + (deliveryfee);
        tax = total * taxRate;
        lastTotal = total * ( 1 + taxRate );

// Payment Confirmation
        System.out.println(firstName + ", here is your order:");
        System.out.println("You had selected option "+inches+" pizza");
        System.out.println(crust +", " + toppings);
        System.out.println("Order Cost: $" + df.format(total));
        System.out.println("Tax: $" + df.format(tax));
        System.out.println("Total Due: $" + df.format(lastTotal));
    }
}
