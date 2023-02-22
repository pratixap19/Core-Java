package encapsulation;

public class Student_eval {

	public static void main(String[] args) {
		Student student = new Student();
		student.setData("Rahul", 101);

		System.out.println(student.getData());
		System.out.println(student.getData1());

	}

}
