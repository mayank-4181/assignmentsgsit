package dailyassignment;

public class DailyAssign7_CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int num = 1;
		boolean isPrimecheck = true;
		
		if(num<=1) {
			isPrimecheck = false;
		  System.out.println("Number not acceptable to check for the prime number");   
			}
			
		
		else {
			  for (int i=2;i<=num-1;i++) {
				  if(num%i==0) {
					  
					  isPrimecheck = false;
					  break;
				  }
					  
			  }
			  
			 
		}
		
		 if(isPrimecheck) {
				System.out.println("Prime");
			}
			else {
				System.out.println("Not prime");
			}
		
		
	}

}
