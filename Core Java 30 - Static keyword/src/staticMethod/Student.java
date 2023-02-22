package staticMethod;

public class Student {

	String studentName;
	int rollNo;
	static String collegeName = "ABC";

	Student(String newName, int newrollNo) {

		this.studentName = newName;
		this.rollNo = newrollNo;

	}

	static void staticMethod() {
		collegeName = "XYZ";//A static method can access static data member and can change the value of it.
		System.out.println("Static method called");
	}
	
	public void display() {
		
		System.out.println(studentName);
		System.out.println(rollNo);
		System.out.println(collegeName);
		
	}

	public static void main(String[] args) {

		Student.staticMethod();//static method is called with class name. No required to create object to call static method.

		Student obj1 = new Student("John", 12);
		Student obj2 = new Student("Peter", 22);
		
		obj1.display();
		obj2.display();

	}

}
