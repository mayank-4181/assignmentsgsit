package dailyassignment;

public class Employee {
	
	private String name;
	private int id;
	private String dept ;
	
	   public Employee(String n, int id_num, String department) {
		// TODO Auto-generated constructor stub
		   
		   name = n;
		   id=id_num;
		   dept=department;
		
		
	} 
	   
	   public Employee(String n1,int id1) {
		         name = n1;
		         id = id1;
		          dept = "General";
		          
	   }
	   
	  public Employee() {
		 name="Unknown";
		 id=0;
		 dept ="Not Assigned";
	}
   // Getters and Setters in Java

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept=dept;
	}
	
	
	   
}
