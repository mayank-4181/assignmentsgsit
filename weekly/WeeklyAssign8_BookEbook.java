package weeklyassignment;

class Book{
	String title;
	String author;
	static String libraryName;
	final static String ISBN="12345";
	Book(String title, String author){
		this.title=title;
		this.author=author;
	}
	
	void display() {
		System.out.print("Title is : " + title + "and" + "Author is : " + author);
	}
	
	void getDescription() {
		System.out.println("This is a physical book");
	}
	
	static void showlibrary() {
		System.out.println("Library:" + libraryName);
	}
	
}

class Ebook extends Book{
	String fileSize;
	Ebook(String title, String author,String fileSize) {
		super(title, author);
		this.fileSize=fileSize;
		// TODO Auto-generated constructor stub
	}

	void display() {
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("FileSize is : " + fileSize);
	}
	
	void getDescription() {
		super.getDescription();
		System.out.println("This is an electronic book");
	}
	
	
}


public class WeeklyAssign8_BookEbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Ebook obj = new Ebook("Atomic Habits", "James Clear", "5MB");
     obj.display();
     obj.getDescription();
    Book.libraryName="City Library";
   // Book.ISBN="31246";
    Book.showlibrary();
   // System.out.println(Book.ISBN);
    String title="java programming";
    System.out.println("Original String : " + title);
    String title1=title.toUpperCase();
    System.out.println("After this is converted to uppercase : " + title1);
    int len = title1.length();
    System.out.println("The length of the string is : " + len);
    System.out.println(title1.contains("JAVA"));
  
	}

}
