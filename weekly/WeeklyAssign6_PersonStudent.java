package weeklyassignment;

class Person{
	
	String name;
	int age;
	
	
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
}

class Student extends Person{
	
	int marks;
	
	Student(String name, int age, int marks){
		super(name,age);
		this.marks=marks;
	}
	
	void display() {
		System.out.println("Name is : " + name);
		System.out.println("Age is : " + age);
		System.out.println("Marks is : " + marks);
	}
}



public class WeeklyAssign6_PersonStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stdnt= new Student("Ramesh",14,85);
		stdnt.display();

	}

}
