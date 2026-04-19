package weeklyassignment;

class Employee{
	int id;
	String name;
	double basicSalary;
    double TotalSalary;

	
	Employee(int id, String name, double basicSalary){
		this.id=id;
		this.name=name;
		this.basicSalary=basicSalary;
	}
	
	void calculateSalary() {
		double HRA=0.20*basicSalary;
		double bonus=0.10*basicSalary;
		TotalSalary= basicSalary + HRA + bonus;
		System.out.println("HRA is : " + HRA);
		System.out.println("Bonus is : " + bonus);
		
	}
	
	void display() {
		System.out.println(this.id + ":" + this.name + ":" + this.basicSalary + ":" + this.TotalSalary);
	}
	
}


public class WeeklyAssign7_SalaryCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Employee emp = new Employee(101, "Ravi", 50000);
   emp.calculateSalary();
   emp.display();
	}

}
