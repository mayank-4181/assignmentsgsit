package dailyassignment;

public class DailyAssign18_CountConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str = "Hello World";
       int count_of_consonants=0;
       
       for(int i=0;i<str.length();i++) {
    	   
    	   if(str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o'&& str.charAt(i)!='u'
    			   && str.charAt(i)!='A'&&str.charAt(i)!='E'&& str.charAt(i)!='I'&& str.charAt(i)!='O'&& 
    			   str.charAt(i)!='U'&& str.charAt(i)!=' ') {
    		   count_of_consonants++;
    	   }
    	   
       }
       System.out.println("number of consonants:" + count_of_consonants);
	}
	

}
