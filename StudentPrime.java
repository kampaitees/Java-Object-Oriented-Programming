import java.util.Scanner;
class lab {
	public static void main(String args[]) {
		String name, rollno, dateOfBirth, email;
		double CGPA, salary_offered, department;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of student:");
		int number  = input.nextInt();
		Student[] obj = new Student[number];
		for(int i=0; i<number; i++) {
			obj[i] = new Student();
			System.out.println("Enter the name:");
			obj[i].name  = input.next();
			System.out.println("Enter the rollNo:");
			obj[i].rollno  = input.next();
			System.out.println("Enter the department");
			System.out.println("1.CSE\t2.IT\t3.ECE\t4.EEE");
			obj[i].department  = input.nextDouble();
			System.out.println("Enter the date of birth:");
			obj[i].dateOfBirth  = input.next();
			System.out.println("Enter the email:");
			obj[i].email  = input.next();
			System.out.println("Enter the salary_offered:");
			obj[i].salary_offered  = input.nextInt();
			System.out.println("Enter the CGPA:");
			obj[i].CGPA  = input.nextDouble();
		}
		Student[] objPrime = new Student[4];
		int count[] = new int[4];
		for(int i=0; i<number; i++) {
			objPrime[i] = new Student();
			if(obj[i].department == 1) {
				count[0] += 1;
				objPrime[0].CGPA += obj[i].CGPA;
			}
			else if(obj[i].department == 2) {
				count[1] += 1;
				objPrime[1].CGPA += obj[i].CGPA;
			}
			else if(obj[i].department == 3) {
				count[2] += 1;
				objPrime[2].CGPA += obj[i].CGPA;
			}
			else if(obj[i].department == 4) {
				count[3] += 1;
				objPrime[3].CGPA += obj[i].CGPA;
			}
		}
		for(int i=0; i<4; i++) {
			if(count[i] != 0)
				objPrime[i].CGPA /= count[i];
		}
		double max = objPrime[0].CGPA, index = 0;
		for(int i=1; i<4; i++) {
			if(objPrime[i].CGPA > max) {
				max = objPrime[i].CGPA;
				index = i;
			}
		}
		Student Cse[] = new Student[count[0]];
		Student It[] = new Student[count[1]];
		Student Ece[] = new Student[count[2]];
		Student Eee[] = new Student[count[3]];
		double swap;
		int a = 0, b = 0, c = 0, d = 0;
		String temp;
		for(int i=0; i<number; i++) {
			if(obj[i].department == 1.0) {
				Cse[a] = new Student();
				Cse[a].department = obj[i].department;
				Cse[a].CGPA = obj[i].CGPA;
				a += 1;
			}
			else if(obj[i].department == 2.0) {
				It[b] = new Student();
				It[b].department = obj[i].department;
				It[b].CGPA = obj[i].CGPA;
				b += 1;
			}
			else if(obj[i].department == 3.0) {
				Cse[c] = new Student();
				Cse[c].department = obj[i].department;
				Cse[c].CGPA = obj[i].CGPA;
				c += 1;
			}
			else if(obj[i].department == 4.0) {
				Cse[d] = new Student();
				Cse[d].department = obj[i].department;
				Cse[d].CGPA = obj[i].CGPA;
				d += 1;
			}
		}
		if(index == 0) {
			for(int i=0; i<count[0]; i++) {
				for(int k=0; k<count[0]-i-1; k++) {
					if(Cse[k].CGPA > Cse[k+1].CGPA) {
						swap = Cse[k].CGPA;
						Cse[k].CGPA = Cse[k+1].CGPA;
						Cse[k+1].CGPA = swap;
						
						swap = Cse[k].salary_offered;
						Cse[k].CGPA = Cse[k+1].salary_offered;
						Cse[k+1].salary_offered = swap;
						
						swap = Cse[k].department;
						Cse[k].department = Cse[k+1].department;
						Cse[k+1].department = swap;
						
						temp = Cse[k].name;
						Cse[k].name = Cse[k+1].name;
						Cse[k+1].name = temp;
						
						temp = Cse[k].rollno;
						Cse[k].rollno = Cse[k+1].rollno;
						Cse[k+1].rollno = temp;
						
						temp = Cse[k].email;
						Cse[k].email = Cse[k+1].email;
						Cse[k+1].email = temp;
						
						temp = Cse[k].dateOfBirth;
						Cse[k].dateOfBirth = Cse[k+1].dateOfBirth;
						Cse[k+1].dateOfBirth = temp;
						
						
					}
				}
			}
		}
		else if(index == 1) {
			for(int i=0; i<count[1]; i++) {
				for(int k=0; k<count[1]-i-1; k++) {
					if(It[k].CGPA > It[k+1].CGPA) {
						swap = It[k].CGPA;
						It[k].CGPA = It[k+1].CGPA;
						It[k+1].CGPA = swap;
						
						swap = It[k].salary_offered;
						It[k].CGPA = It[k+1].salary_offered;
						It[k+1].salary_offered = swap;
						
						swap = It[k].department;
						It[k].department = It[k+1].department;
						It[k+1].department = swap;
						
						temp = It[k].name;
						It[k].name = It[k+1].name;
						It[k+1].name = temp;
						
						temp = It[k].rollno;
						It[k].rollno = It[k+1].rollno;
						It[k+1].rollno = temp;
						
						temp = It[k].email;
						It[k].email = It[k+1].email;
						It[k+1].email = temp;
						
						temp = It[k].dateOfBirth;
						It[k].dateOfBirth = It[k+1].dateOfBirth;
						It[k+1].dateOfBirth = temp;
						
						
					}
				}
			}
		}
		if(index == 2) {
			for(int i=0; i<count[2]; i++) {
				for(int k=0; k<count[2]-i-1; k++) {
					if(Eee[k].CGPA > Eee[k+1].CGPA) {
						swap = Eee[k].CGPA;
						Eee[k].CGPA = Eee[k+1].CGPA;
						Eee[k+1].CGPA = swap;
						
						swap = Eee[k].salary_offered;
						Eee[k].CGPA = Eee[k+1].salary_offered;
						Eee[k+1].salary_offered = swap;
						
						swap = Eee[k].department;
						Eee[k].department = Eee[k+1].department;
						Eee[k+1].department = swap;
						
						temp = Eee[k].name;
						Eee[k].name = Eee[k+1].name;
						Eee[k+1].name = temp;
						
						temp = Eee[k].rollno;
						Eee[k].rollno = Eee[k+1].rollno;
						Eee[k+1].rollno = temp;
						
						temp = Eee[k].email;
						Eee[k].email = Eee[k+1].email;
						Eee[k+1].email = temp;
						
						temp = Eee[k].dateOfBirth;
						Eee[k].dateOfBirth = Eee[k+1].dateOfBirth;
						Eee[k+1].dateOfBirth = temp;
						
						
					}
				}
			}
		}
		if(index == 3) {
			for(int i=0; i<count[3]; i++) {
				for(int k=0; k<count[3]-i-1; k++) {
					if(Ece[k].CGPA > Ece[k+1].CGPA) {
						swap = Ece[k].CGPA;
						Ece[k].CGPA = Ece[k+1].CGPA;
						Ece[k+1].CGPA = swap;
						
						swap = Ece[k].salary_offered;
						Ece[k].CGPA = Ece[k+1].salary_offered;
						Ece[k+1].salary_offered = swap;
						
						swap = Ece[k].department;
						Ece[k].department = Ece[k+1].department;
						Ece[k+1].department = swap;
						
						temp = Ece[k].name;
						Ece[k].name = Ece[k+1].name;
						Ece[k+1].name = temp;
						
						temp = Ece[k].rollno;
						Ece[k].rollno = Ece[k+1].rollno;
						Ece[k+1].rollno = temp;
						
						temp = Ece[k].email;
						Ece[k].email = Ece[k+1].email;
						Ece[k+1].email = temp;
						
						temp = Ece[k].dateOfBirth;
						Ece[k].dateOfBirth = Ece[k+1].dateOfBirth;
						Ece[k+1].dateOfBirth = temp;
						
						
					}
				}
			}
		}
		if(index == 0) {
			System.out.println("Department with maximum CGPA is CSE and average CGPA of department is: "+objPrime[0].CGPA); 
			for(int i=count[0]-1; i>=0; i--)  {
				System.out.println("Student name: "+Cse[i].name);
				System.out.println("Student CGPA: "+Cse[i].CGPA);
				System.out.println("Student rollno: "+Cse[i].rollno);
				System.out.println("Student dateOfBirth: "+Cse[i].dateOfBirth);
				System.out.println("Student salary_offered: "+Cse[i].salary_offered);
				System.out.println("Student email: "+Cse[i].email);
			}
		}
		else if(index == 1) {
			System.out.println("Department with maximum CGPA is IT and average CGPA of department is: "+objPrime[1].CGPA);
			for(int i=count[1]-1; i>=0; i--)  {
				System.out.println("Student name: "+It[i].name);
				System.out.println("Student CGPA: "+It[i].CGPA);
				System.out.println("Student rollno: "+It[i].rollno);
				System.out.println("Student dateOfBirth: "+It[i].dateOfBirth);
	 			System.out.println("Student salary_offered: "+It[i].salary_offered);
				System.out.println("Student email: "+It[i].email);
			}
		}
		else if(index == 2) {
			System.out.println("Department with maximum CGPA is EEE and average CGPA of department is: "+objPrime[2].CGPA);
			for(int i=count[2]-1; i>=0; i--)  {
				System.out.println("Student name: "+Eee[i].name);
				System.out.println("Student CGPA: "+Eee[i].CGPA);
				System.out.println("Student rollno: "+Eee[i].rollno);
				System.out.println("Student dateOfBirth: "+Eee[i].dateOfBirth);
				System.out.println("Student salary_offered: "+Eee[i].salary_offered);
				System.out.println("Student email: "+Eee[i].email);
			}
		}
		else if(index == 3) {
			System.out.println("Department with maximum CGPA is ECE and average CGPA of department is: "+objPrime[3].CGPA);
			for(int i=count[3]-1; i>=0; i--)  {
				System.out.println("Student name: "+Ece[i].name);
				System.out.println("Student CGPA: "+Ece[i].CGPA);
				System.out.println("Student rollno: "+Ece[i].rollno);
				System.out.println("Student dateOfBirth: "+Ece[i].dateOfBirth);
				System.out.println("Student salary_offered: "+Ece[i].salary_offered);
				System.out.println("Student email: "+Ece[i].email);
			}
		}
	}
}
class Student {
	String name, rollno, dateOfBirth, email;
	double CGPA, salary_offered, department;
}

