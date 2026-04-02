/*
 * A student scored 87.6 marks in an exam (stored in a float). Perform the following operations:

Convert the float marks into:
double
int
Print all three values.
Convert the final integer value into a character using ASCII and print it.

 */
package weeklyassignment;

public class WeeklyAssign1_StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// float a double (upcasting)
		float fmarks = 87.6f;
		System.out.println("Float value : " + fmarks);
		double dmarks = fmarks;
		System.out.println("Double value : " + dmarks);
		
		//double a int(downcasting)
		int imarks = (int)fmarks;
	    System.out.println("Integer value : " + imarks);
	    
	    //Convert the final integer value into a character using ASCII and print it
	    
	    char cmarks = (char)imarks;
	    System.out.println("Character value : " + cmarks);
		
		
	}

}
