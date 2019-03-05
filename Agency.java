import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Agency {
    String name, place_visited;
    Date start_date, return_date;
    static int n;

    public Agency(String name, String place_visited, Date start_date, Date return_date) {
        this.name = name;
        this.place_visited = place_visited;
        this.start_date = start_date;
        this.return_date = return_date;
        n++;
    }

    public static void display(Agency[] a)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("Passenger: "+(i+1));
            System.out.println("Name: "+a[i].name);
            System.out.println("Place Visited: "+a[i].place_visited);
            System.out.println("Start Date: "+a[i].start_date);
            System.out.println("Return Date: "+a[i].return_date+"\n");
        }
    }
}

class NewAgency extends Agency {
    int age;
    static int n;

    public NewAgency(String name, String place_visited, Date start_date, Date return_date, int age) {
        super(name, place_visited, start_date, return_date);
        this.age = age;
        n++;
    }

    public static void display(NewAgency[] a)
    {
        for(int i=0;i<n;i++)
        {
            if(a[i].age<12)
                continue;
            System.out.println("Passenger: "+(i+1));
            System.out.println("Name: "+a[i].name);
            System.out.println("Age: "+a[i].age);
            System.out.println("Place Visited: "+a[i].place_visited);
            System.out.println("Start Date: "+a[i].start_date);
            System.out.println("Return Date: "+a[i].return_date+"\n");
        }
    }
}

public class ques3 {
    public static void main(String[] args) {
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
        NewAgency[] n =new NewAgency[4];
        System.out.println("Enter details of passengers");
        String name, places_visited, ss,rs;
        int age;
        Date s=new Date();
        Date r=new Date();
        for(int i=0;i<4;i++)
        {
            System.out.println("Name, place visited, start date(dd/MM/yyy), return date(dd/MM/yyyy) and age");
            Scanner sc = new Scanner(System.in);
            name = sc.next();
            places_visited = sc.next();
            ss=sc.next();
            rs=sc.next();
            age=sc.nextInt();
            try {
                s = ft.parse(ss);
            } catch (ParseException e) {
                System.out.println("Unparseable using " + ft);
            }
            try {
                r = ft.parse(rs);
            } catch (ParseException e) {
                System.out.println("Unparseable using " + ft);
            }
            n[i] = new NewAgency(name,places_visited,s,r,age);

        }
        NewAgency.display(n);

    }
}

