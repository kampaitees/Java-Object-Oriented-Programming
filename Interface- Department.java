import java.util.Scanner;
public class lab7p3 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        Students [] student = new Students[50];
        int current = 0;
        while(true) {
            System.out.println("1.Admit Student\n2.Migrate Student\n3.Display details\n4Exit\n");
            int choice = input.nextInt();

            if(choice == 1) {
                student[current] = new Students();
                System.out.println("Enter Hostel Name ");
                student[current].hostelName = input.next();
                System.out.println("Enter Hostel Location");
                student[current].hostelLocation = input.next();
                System.out.println("Enter Number of rooms");
                student[current].numberOfRooms =  input.nextInt();
                System.out.println("Enter Student Name");
                student[current].studentName = input.next();
                System.out.println("Enter Registration Number");
                student[current].regNo =  input.nextInt();
                System.out.println("Enter Elective Course");
                student[current].electiveCourse = input.next();
                System.out.println("Enter Average marks");
                student[current].avgMarks = input.nextDouble();
                current += 1;
            }

            if(choice == 2) {

                System.out.println("Enter Registration Number");
                int regNo =  input.nextInt();

                if(current == 0)
                    System.out.println("Student dosen't exist");
                else {
                    for (int i = 0; i < current; i++) {

                        if (student[i].regNo == regNo) {
                            System.out.println("Enter hostel name");
                            student[i].hostelName = input.next();
                            System.out.println("Enter hostel location");
                            student[i].hostelLocation = input.next();
                            System.out.println("Enter number of rooms");
                            student[i].numberOfRooms = input.nextInt();
                        } else
                            System.out.println("Student dosen't exist");
                    }
                }
            }

            if(choice == 3) {

                System.out.println("Enter Registration Number");
                int regNo =  input.nextInt();


                for(int i=0; i<current; i++) {
                    if (student[i].regNo == regNo) {
                        student[i].show();
                        student[i].display();
                    }
                    else
                        System.out.println("Student dosen't exist");
                }
            }
            if(choice == 4)
                break;
        }
    }
}

interface Department {
     final String deptName = "CS";
     final String deptHead = "Alwyn Pais";

     void show();
}

class Hostel  {
    String hostelName, hostelLocation;
    int numberOfRooms;
    public void display() {
        System.out.println("Hostel Name : "+this.hostelName);
        System.out.println("Hostel Location: "+this.hostelLocation);
        System.out.println("Number of rooms : "+this.numberOfRooms);
    }

}

class Students extends Hostel implements Department  {

    String studentName, electiveCourse;
    int regNo;
    double avgMarks;

    public void show() {
        System.out.println("Department Name : " + this.deptName);
        System.out.println("Department head: " + this.deptHead);
    }
    public void display() {
        super.display();
        System.out.println("Student Name : "+this.studentName);
        System.out.println("Registration Number: "+this.regNo);
        System.out.println("Elective Course : "+this.electiveCourse);
        System.out.println("Average marks : "+this.avgMarks);
    }
}
