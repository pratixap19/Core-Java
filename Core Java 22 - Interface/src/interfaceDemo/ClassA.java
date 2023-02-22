package interfaceDemo;

public class ClassA implements A, B{
	
	public static void main(String[] args) {
		
	}

	@Override
	public void interfaceBmethod() {
		
		System.out.println("Interface B method called");
	}

	@Override
	public void display() {
		
		
	}

	@Override
	public void interfaceAmethod() {
		
		System.out.println("Interface A method called");
		
	}

}
