package dailyassignment;
class Company{
	final String companyName="TCS";
	String location;
	
	Company(){
		
	}
	
	Company(String location) {
		// TODO Auto-generated constructor stub
		this.location=location;
	}
}

   class Employee1 extends Company{
	   int id;
	   String name;
	   
	   Employee1(String location, int id, String name){
		   super.location=location;
		   this.id=id;
		   this.name=name;
		   
		  
	   }
	   
	   void printData() {
		   System.out.println("CompanyName is : " + companyName);
		   System.out.println("Location is : " + location);
		   System.out.println("Name is : " + name);
		   System.out.println("Id is : " + id);
	   }
   }



public class DailyAssign16_SimpleCompanySystem {
	public static void main(String[] args) {
		Employee1 e = new Employee1("Mumbai",101,"Ramesh");
		e.printData();
	}
	

}
