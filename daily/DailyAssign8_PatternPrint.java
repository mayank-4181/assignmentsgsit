/*
 * create below patterns

*****
****
***
**
*

 */

package dailyassignment;

public class DailyAssign8_PatternPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          for(int i=1;i<=5;i++) {
        	       for(int j=5;j>=i;j--) {
        	    	   System.out.print("*");  // Printing stars in single line
        	       }
        	       
        	       System.out.println(); //printing these stars in another line
          }
	}

}
