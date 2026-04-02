package weeklyassignment;

public class WeeklyAssign3_FibonacciSeries {
	
	public static void main(String[] args) {
		
		int num = 10;
		 int x=0; 
		 int y=1;
		 int z;
		 
		 System.out.print(x + " " + y + " ");
		 for (int i=2;i<num;i++) {
			 
			     z=x+y;
			    
			     x=y;
			     y=z;
			     
			     if(x>100||y>100 || z>100) {
			    	 break;
			     }
			     System.out.print(z + " ");
		 }
		 
		 
		 
	}

}
