package weeklyassignment;

class Vehicle{
	String brand;
	int speed;
	static String company;
	
	public Vehicle(String brand,int speed) {
		// TODO Auto-generated constructor stub
		this.brand=brand;
		this.speed=speed;
	}
	void run() {
		System.out.println("Vehicle is running");
	}
	
	static void displayCompany() {
		System.out.println("Company: " + company);
	}
	
	final static void engineType() {
		System.out.println("Engine type: Standard Engine");
	}
}

class Car extends Vehicle{
	String fuelType;
	Car(String brand,int speed,String fuelType){
		super(brand, speed);
		this.fuelType=fuelType;
		
		
	}
	
	void display() {
		System.out.println("Brand : " + brand);
		System.out.println("Speed : " + speed);
		System.out.println("Fuel Type : " + fuelType);
	}
	
	void run() {
		super.run();
		System.out.println("Car is running smoothly");
	}
	/*
	final static void engineType() {
		System.out.println("Engine type : Modern Engine");
	}
	*/
}


public class WeeklyAssign9_VehicleCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Car obj = new Car("Hyundai",120,"Petrol");
         System.out.println("-----Inheritance + Constructor outputs-------");
         obj.display();
         System.out.println("-----Method Overriding outputs----");
         obj.run();
         System.out.println("---Static Variable & Method-----");
        Vehicle.company="AutoWorld Ltd";
        Vehicle.displayCompany();
         System.out.println("---Final Method--------");
         Vehicle.engineType();
        // Car.engineType();
         
         System.out.println("----String Methods------");
         String str = obj.brand;
         System.out.println("Original String is : " + str);
         
         String rev="";
        //int len= str.length();
        //System.out.println("Length is : " + len);
        
        for(int i = str.length()-1;i>=0;i--) {
        	rev=rev+str.charAt(i);
        }
        System.out.println("Reversed is : " + rev);
        
        //Replace character
        for(int i=0;i<=str.length()-1;i++) {
        	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
        		System.out.print("*");
        	}
        	else {
        		System.out.print(str.charAt(i));
        	}
        	
        	
        	
        }
        System.out.println(); 
        System.out.println(str.equals("Hyundai"));
	}

}
