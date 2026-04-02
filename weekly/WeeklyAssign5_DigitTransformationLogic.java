package weeklyassignment;

public class WeeklyAssign5_DigitTransformationLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int num = 57243;
           int position =1;  // start from rightmost digit
           int newNum=0; // to store the new number
           int placeValue=1;// to rebuild number correctly
           
           //2.	Traverse digits from right to left 
           while(num>0) {
        	   int ldigit=num%10;
        	   
        	   if(position%2!=0 && ldigit<=4) {
        		   ldigit = ldigit*2;
        		   System.out.println("If digit is at odd place  AND digit ≤ 4 → multiply by 2 is : " + ldigit);
        	   }
        	   
        	   else if(position%2==0) {
        		   ldigit=1;
        		   System.out.println("if digit is at even place→ replace with 1:" + ldigit);
        	   }
        	   
        	   else {
        		   System.out.println("Else keep at it is i.e digit at odd place and >4: " + ldigit);
        	   }
        	   
       // to build new number
        	   newNum = newNum + ldigit*placeValue;
        	   
        	   num = num/10;
        	   position++;
        	   placeValue=placeValue*10;
        	   
           }
           
           System.out.println(newNum);
	}

}
