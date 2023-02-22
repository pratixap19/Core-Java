package usage1;
//To refer current class instance variable.
public class Student {
	
	public String studentName;
	public int rollNo;
	public int age;
	
	Student(String studentName, int rollNo, int age)
	{
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.age = age;
	}
	
	public void display() {
		System.out.println(studentName);
		System.out.println(rollNo);
		System.out.println(age);
	}

	public static void main(String[] args) {
		
        Student obj = new Student("Pratixa", 12, 52);
        obj.display();
        
	}

}
