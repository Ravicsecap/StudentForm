package javafullcourse;

import java.util.Scanner;

public class StudentForm {

	public static void main(String[] args) {
		
		System.out.println("Enter is Student i.d. Number:-");
		Scanner s=new Scanner(System.in);
		byte Studentid=s.nextByte();
		System.out.println("Enter is Student Name:-");
		String StudentName=s.next();
		System.out.println("Enter is Student Gender:-");
		char StudentGender=(char) s.next().charAt(0);
		System.out.println("Enter the  Student Mobile no. :-");
		long StudentMobileNo=s.nextLong();
		System.out.println("Enter the  Student CGPA :-");
		float StudentCGPA=s.nextFloat();
		System.out.println("Enter is Student i.d. Number:- " + Studentid);
		System.out.println("Enter is Student Name:-" +StudentName);
		System.out.println("Enter is Student Gender:-"+StudentGender);
		System.out.println("Enter is Student mobile:-"+StudentMobileNo);
		System.out.println("Enter is Student CGPA:-"+StudentCGPA);
		
		

	}

}
