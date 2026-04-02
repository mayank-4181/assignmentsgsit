//Armstrong number - 1^3 +5^3  + 3^3 = 1+125+27 = 153
package dailyassignment;

public class DailyAssign6_ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		   int num =121;
		   int originalnumber = num; 
		   int result = 0;
		
		   
		   while(num>0) {
			   int ldigit = num%10;  //to obtain last digit
			   result = result + ldigit*ldigit*ldigit;
			   num = num/10;
		   }
		   if(result == originalnumber)
			   System.out.println("It is an Armstrong number");
		   else 
			   System.out.println("It is not an Armstrong number");
				   
	}

}
