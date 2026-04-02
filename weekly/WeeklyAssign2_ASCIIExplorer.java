/*
 * Write a Java program that:
Takes a character input from the user (e.g., 'A').
Finds and prints its ASCII value.
Adds 5 to the ASCII value.
Converts the new value back to a character and prints it.
 */

package weeklyassignment;

import java.util.Scanner;

public class WeeklyAssign2_ASCIIExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the character : ");
		
		//Read input as a string and take the first character
		char inputChar = sc.next().charAt(0);
		
		System.out.println("Input character is : " + inputChar);
		
		int numChar = inputChar;
		System.out.println("ASCII value : " + numChar);
		
		int numchar1 = numChar + 5;
		System.out.println("New  ASCII value : " + numchar1);
		
		char asciiChar = (char) numchar1;
		System.out.println("New character : " + asciiChar);
		
		sc.close();
	}

}
