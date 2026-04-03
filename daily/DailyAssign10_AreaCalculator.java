package dailyassignment;

public class DailyAssign10_AreaCalculator {
    //Area of circle
	static double area(double radius) {
	    
		return Math.PI*radius*radius;
		}
	//Area of rectangle
	static int area(int length, int breadth) {
		 
		return length * breadth;
	}
	//Area of square
	static int area(int side) {
		 
		return side*side;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
          System.out.println("Area of the circle is : " + area(5.32));
          System.out.println("Area of the rectangle is : " + area(5,6));
          System.out.println("Area of the square is : " + area(8));
	}

}
