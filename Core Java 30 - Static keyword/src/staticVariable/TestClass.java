package staticVariable;

public class TestClass {

	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.studentName = "James";
		obj.rollNo = 1234;
		
		System.out.println("Student name is " + obj.studentName);
		System.out.println("Student rollNo is " + obj.rollNo);
		System.out.println("College name is " + obj.collegeName);
		
		Student obj1 = new Student();
		obj1.studentName = "Peter";
		obj1.rollNo = 34;
		
		System.out.println("Student name is " + obj1.studentName);
		System.out.println("Student rollNo is " + obj1.rollNo);
		System.out.println("College name is " + obj1.collegeName);
		
	}

}
