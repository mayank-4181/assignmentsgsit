package dailyassignment;

import java.util.Scanner;

public class DailyAssign19_BasicUserDetailsInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name : ");
		 String name = sc.nextLine();
		 
		System.out.println("Enter the age : ");
		 int age = sc.nextInt();
		
		 System.out.println("Enter the salary : ");
		double salary=sc.nextDouble();
		
		System.out.println("-------Print Details----------");
		
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Salary : " + salary);
		sc.close();
		
		
		

	}

}
