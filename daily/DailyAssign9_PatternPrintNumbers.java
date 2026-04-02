/*
 * 1
   12
   123
   1234
   12345
 */
package dailyassignment;

public class DailyAssign9_PatternPrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
            for(int i=1;i<=5;i++) {
            	    
            	     for(int j=1;j<=i;j++) {
            	    	    System.out.print(j + "");
            	     }
            	     System.out.println();
            }
          
		
		/* Print the below pattern
		   1111
           2222
           3333
           4444
		
		 */
                  System.out.println("--------------------------------------------------------");
                  System.out.println("Second Pattern");
                  
        for (int i=1;i<=4;i++) {
        	     for (int j=1;j<=4;j++) {
        	    	 System.out.print(i);
        	     }
        	     System.out.println();
        }    
           
        /* Print the below pattern
		   4444
           3333
           2222
           1111
		
		 */
        System.out.println("--------------------------------------------------------");
        System.out.println("Third Pattern");
        
        for (int i=4;i>=1;i--) {
        	  for(int j=1;j<=4;j++) {
        		  System.out.print(i);
        	  }
        	  System.out.println();
        }
	}

}
