package weeklyassignment;

public class WeeklyAssign4_PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=180;
       
       
       
           for (int fact = 2;fact<=num;fact++) {
        	   if (num%fact==0) {
        		   System.out.print(fact + " ");
        	   }
        	   
        	 
        	 
        	 if(fact==num/2) {
        		 break;
        	 }
        	
        	 while(num%fact==0) {
     		    
     		    num=num/fact;
     	 }
         
           }
	}

}
