package dailyassignment;

public class DailyAssign17_PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str ="madam";
     String revString = "";
     
     int len = str.length();
     
     for(int i=len-1;i>=0;i--) {
    	 revString = revString + str.charAt(i);
     }
     
    System.out.println("The string is : " + revString);
    
    if(revString.equals(str)) {
    	System.out.println("Given string and obtained string is  Palindrome");
    }
    else {
    	System.out.println("Given string and obtained string is not Palindrome");
    }
	}

}
