package arrayList;
//followed Automation Testing Insider tutorials
//use of user defined class objects in ArrayList
import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		Student obj1 = new Student("John", 18,21);
		Student obj2 = new Student("Jim", 21, 23);
		Student obj3 = new Student("Jack", 32, 38);
		
		ArrayList<Student> arrList = new ArrayList<Student>();
		arrList.add(obj1);
		arrList.add(obj2);
		arrList.add(obj3);
		
		//Iterate through Iterator
		
		Iterator<Student> itr = arrList.iterator();
		
		while(itr.hasNext()) {
			
			Student stu = itr.next();
			System.out.println(stu.stuName);
			System.out.println(stu.age);
			System.out.println(stu.rollNo);
			
			
			
		}
	}

}
