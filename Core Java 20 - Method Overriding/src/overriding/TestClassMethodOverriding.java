package overriding;
//Automation Testing insider
public class TestClassMethodOverriding {

	public static void main(String[] args) {
		
		ClassC obj = new ClassC();//child class method will be overridden.
		obj.add(3, 8);
		obj.classCMethod();
		obj.classPMethod();
		
		System.out.println(".......................");
		
		ClassP obj1 = new ClassC();//child class method will be overridden.This is example of dynemic polymorphism. Which method is called 
		//it is determined by JVM based on the type of object created at the runtime.This is called upcasting.
		//JVM during runtime 
		obj1.add(3, 8);
		//obj1.classCMethod();
		obj1.classPMethod();

	}

}
