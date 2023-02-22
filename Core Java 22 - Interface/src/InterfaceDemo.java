
interface TestInt{
		int a=10;//by default variable is static and final
		void display(); //by default method is public and abstract
	}

public class InterfaceDemo implements TestInt{
	
	public void display() {
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		InterfaceDemo ie = new InterfaceDemo();
		ie.display();

	}

}
