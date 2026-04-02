package dailyassignment;

public class DailyAssign4_StudentResultSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int m1 = 72;
		int m2 = 92;
		int m3 = 85;
		int m4 = 68;
		int m5 = 88;
		
		if(m1<33||m2<33||m3<33||m4<33||m5<33) {
			System.out.println("Result = Fail");
			System.out.println("Grade = F");
		}
		
		else {

       int totalmarks = m1+m2+m3+m4+m5;
       System.out.println(totalmarks);
		 double percentage = totalmarks/5.0;
		  System.out.println("Result = Pass" + "\t" + "Percentage is " + percentage);
		
		
		if(percentage>=90) {
			System.out.println("Grade A+");
		}
		else if(percentage>=75 ) {
			System.out.println("Grade A");
		}
		else if(percentage>=60) {
			System.out.println("Grade B");
		}
		else if(percentage>=50) {
			System.out.println("Grade C");
		}
		
		else if (percentage>=33) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Fail");
		}
			
	}
	}
}
