package dailyassignment;

public class DailyAssign14_LeftShiftArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr = {1,2,3,4,5,6};
      
      int firstElement = arr[0];
      
      int i=0;
        System.out.println(arr.length);
      while(i<arr.length-1) {
    	 
    	  arr[i]=arr[i+1];
    	  i++;
    	 
    	  
      }
      arr[arr.length-1] = firstElement;
      
      //Print the output using for-each loop
      for(int x:arr) {
    	  System.out.print(x + " ");
      }
	}

}
