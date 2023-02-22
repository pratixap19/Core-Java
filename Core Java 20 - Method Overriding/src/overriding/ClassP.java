package overriding;

public class ClassP {
	

	public void add(int a, int b) {
		
		int c = a+b;
		System.out.println("Parent class method" + c);
	}
	
	public void classPMethod() {
		
		System.out.println("Parent class method call");
		
	}

}
