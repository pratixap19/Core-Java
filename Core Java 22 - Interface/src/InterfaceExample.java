
public interface TestInterface{
	int a = 10;//by default variable is public, final and static.
	void display();// by default methods are public and abstract.
}

public class InterfaceExample implements TestInterface {
	
	public void display() {
		System.out.println("I am implemented method of interface");
	}

	public static void main(String[] args) {
		//InterfaceExample ie = new InterfaceExample();
		//ie.display();
		
		TestInterface tf = new InterfaceExample();//Interface is not instantiated but we can create object reference of interface.
		tf.display();
	}

}
