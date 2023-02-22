package encapsulationDemo;

public class Test {

	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.setStdName("James");
		obj.setStuRoll(123);
		obj.setAge(23);
		
		System.out.println("Student name is: " + obj.getStdName());
		System.out.println("Student roll number is: " + obj.getStuRoll());
		System.out.println("Student age is: " + obj.getAge());
		
		

	}

}
