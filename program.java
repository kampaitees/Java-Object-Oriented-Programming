import java.util.Date;
import java.util.Scanner;

class Student
{
    String name, rollno, email, dob;
    double salary_offered, CGPA;
    int department;

    Student(String name, String rollno, int department, String email, double salary_offered, double CGPA, String dob) {
        this.name = name;
        this.rollno = rollno;
        this.department = department;
        this.email = email;
        this.salary_offered = salary_offered;
        this.CGPA = CGPA;
        this.dob = dob;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getRollno() {
        return rollno;
    }

    void setRollno(String rollno) {
        this.rollno = rollno;
    }

    int getDepartment() {
        return department;
    }

    void setDepartment(int department) {
        this.department = department;
    }

    String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    double getSalary_offered() {
        return salary_offered;
    }

    void setSalary_offered(double salary_offered) {
        this.salary_offered = salary_offered;
    }

    double getCGPA() {
        return CGPA;
    }

    void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    String getDob() {
        return dob;
    }

    void setDob(String dob) {
        this.dob = dob;
    }
}

class program {
    public static void main(String[] args)
    {
        String name, rollno, email, dob;
        int  department;
        double salary_offered, CGPA;

        System.out.println("Enter the number of students");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Student s[] = new Student[N];

        double[] total_sal = new double[10];
        double[] total_cgpa = new double[10];
        int[] n_pf_d = new int[10];
        int max_sal=1;
        int max_cgpa=1;

        for(int i=0;i<N;i++)
        {
            System.out.println("Enter details of Student "+(i+1));
            System.out.println("Name, Roll Number, Email, Salary Offered, CGPA");
            sc = new Scanner(System.in);
            name = sc.next();
            rollno = sc.next();
            email = sc.next();
            salary_offered = sc.nextDouble();

            CGPA = sc.nextDouble();
            System.out.println("Enter Department Number: 1.CSE 2.IT 3.ECE 4.EEE 5. Mechanical");
            sc = new Scanner(System.in);
            department = sc.nextInt();
            n_pf_d[department] = n_pf_d[department] + 1;

            total_sal[department] = total_sal[department]+ salary_offered;
            total_cgpa[department] = total_cgpa[department] + CGPA;

            System.out.println("Enter Date of Birth (YYYY/MM/DD)");
            dob = sc.next();
            s[i]= new Student(name,rollno,department,email,salary_offered,CGPA,dob);
        }

        for(int i=1;i<=5;i++)
        {
            if(n_pf_d[i]!=0)
            {
                total_cgpa[i] = total_cgpa[i]/n_pf_d[i];
                total_sal[i] = total_sal[i]/n_pf_d[i];
            }
        }

        for(int i=1;i<=5;i++)
        {
            if(total_cgpa[i]>total_cgpa[max_cgpa])
                max_cgpa = i;
            if(total_sal[i]>total_sal[max_sal])
                max_sal = i;
        }




        int[] student_ages = new int[N+1];
        double[] highest_cgpa = new double[N+1];
        int[] students_with_highsal = new int[N+1];
        int[] students_with_highcgpa = new int[N+1];
        String temp;
        int j=0,k=0;


        for(int i=0;i<N;i++) {
            if (s[i].getDepartment() == max_cgpa) {
                highest_cgpa[j] = s[i].getCGPA();
                students_with_highcgpa[j++] = i;

            }
            if(s[i].getDepartment()==max_sal) {
                temp = s[i].getDob();
                student_ages[k] = Integer.parseInt(temp.substring(0,4));
                student_ages[k] = 2019 - student_ages[k];
                students_with_highsal[k++] = i;

            }

        }

        //Sorting CGPA
        for(int p=0;p<j;p++)
            for(int q=0;q<j-p-1;q++)
            {
                if(highest_cgpa[q]<highest_cgpa[q+1])
                {
                    double t1 = highest_cgpa[q];
                    highest_cgpa[q] = highest_cgpa[q+1];
                    highest_cgpa[q+1] = t1;

                    int t2 = students_with_highcgpa[q];
                    students_with_highcgpa[q] = students_with_highcgpa[q+1];
                    students_with_highcgpa[q+1] = t2;
                }
            }

        //Sorting Ages
        for(int p=0;p<k;p++)
            for(int q=0;q<k-p-1;q++)
            {
                if(student_ages[q]>student_ages[q+1])
                {
                    int t1 = student_ages[q];
                    student_ages[q] = student_ages[q+1];
                    student_ages[q+1] = t1;

                    int t2 = students_with_highsal[q];
                    students_with_highsal[q] = students_with_highsal[q+1];
                    students_with_highsal[q+1] = t2;
                }
            }

        System.out.println("Department with highest average CGPA is: "+max_cgpa);
        System.out.println("Students in descending order of their CGPA are:");
            for(int p=0;p<j;p++)
            {
                System.out.println("Student "+(p+1));
                System.out.println("Name: "+s[students_with_highcgpa[p]].getName()+"\nRoll Number: "
                        +s[students_with_highcgpa[p]].getRollno()+"\nEmail: "+s[students_with_highcgpa[p]].getEmail()
                        +"CGPA: "+s[students_with_highcgpa[p]].getCGPA());
            }


        System.out.println("Department with Highest Average Salary is: "+max_sal);
        System.out.println("Students in ascending order of their age are:");
        for(int p=0;p<k;p++)
        {
            System.out.println("Student "+(p+1));
            System.out.println("Name: "+s[students_with_highsal[p]].getName()+"\nRoll Number: "
                    +s[students_with_highsal[p]].getRollno()+"\nSalary Offered: "+s[students_with_highsal[p]].getSalary_offered());
        }


    }
}

