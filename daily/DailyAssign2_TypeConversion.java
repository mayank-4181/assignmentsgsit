/*
 * Write a Java program where:

A float variable marks = 97.8f is given
Convert it into:
double (upcasting)
int (downcasting)
Convert the final int value into a character (ASCII conversion)
Print all intermediate and final values
 */
package dailyassignment;

public class DailyAssign2_TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     float a = 97.8f;
     System.out.println("Float value : " + a);
     
     //Convert it into:double (upcasting)
     double adouble = a;
     System.out.println("Converted to double: " + adouble);
     
   //Convert it into:int (downcasting)
     int aInt = (int) a;
     System.out.println("Converted to int: " + aInt);
     
     //Convert the final int value into a character (ASCII conversion)
     char a1 = (char) aInt;
     System.out.println("Character value: " + a1);
     
     
     
     
	}

}
