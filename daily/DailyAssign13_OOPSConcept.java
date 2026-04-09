package dailyassignment;

public class DailyAssign13_OOPSConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee e1=new Employee();
      Employee e2=new Employee("Priya",101,"HR");
      Employee e3=new Employee("Rahul",102);
      System.out.println("Employee 1:" + e1.getName() + "," + e1.getId() + "," + e1.getDept());
      System.out.println("Employee 2:" + e2.getName() + "," + e2.getId() + "," + e2.getDept());
      System.out.println("Employee 3:" + e3.getName() + "," + e3.getId() + "," + e3.getDept());
      
      e1.setName("Anjali");
      e1.setId(103);
      e1.setDept("Finance");
    
      System.out.println("Updated Employee 1:" + e1.getName() + "," +  e1.getId() + "," + e1.getDept());
     
	}

}
