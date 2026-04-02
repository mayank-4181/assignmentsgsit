/*
 * Write a Java program using a while loop to print numbers from 1 to 50 with the following conditions:

ðŸ”¹ Rules:
If the number is a multiple of 2 and 5 both, print â†’ the square of the number
If the number is only a multiple of 2, print â†’ the cube of the number
If the number is only a multiple of 5, print â†’ the number Ã— 5
Otherwise, print the number as it is
ðŸ“Œ Output Format Example (partial)
1
8
3
64
25
216
7
512
9
100
 */
package dailyassignment;

public class DailyAssign5_PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num = 1;
       while(num<=50) {
    	
    	   if(num%2==0 && num%5==0) {
    		     System.out.println(num*num);
    	   }
    	   	   
    	   else if (num%2==0) {
			System.out.println(num*num*num);
		}
    	 
    	
    	 /*    
    	   if(num%2==0) {
    		           if(num%5==0) {
    		        	   System.out.println(num*num);
    		           }
    		  else {
    		       System.out.println(num*num*num);
    		       }
    		   
    	   }
    	    */
    	   
    	   else if (num%5==0) {
			System.out.println(num*5);
		}
    	   else {
    		   System.out.println(num);
    	   }
    	 
    	    num++;
       }
	}

}
