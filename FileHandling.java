import java.util.*;
import java.io.*;
class lab32 {
	public static void main(String args[]) {
		System.out.println("Enter file name:");
		Scanner input = new Scanner(System.in);
		String file_name = input.nextLine();
		File file = new File(file_name);
		if(file.exists()) {
			if(file.canRead()) 
				System.out.println("File exists and readable");
			else 
				System.out.println("File isn't readable");
			if(file.canWrite()) 
				System.out.println("File exist and writeable");
			else 
				System.out.println("File isn't writeable");
		}
		else
			System.out.println("File doesn't exists");
		System.out.println("The length of file data is: "+file.length());
		System.out.println("The file type is: " +file_name.substring(file_name.lastIndexOf('.')+1));
	}
} 
