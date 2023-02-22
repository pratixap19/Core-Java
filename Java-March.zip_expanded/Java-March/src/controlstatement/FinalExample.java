package controlstatement;

public class FinalExample extends A {
	public final String name;
	
	public final static String name1;
	
	static {
		name1 = "Test1";
		System.out.println("Testing");
		int a = 10+20;
		System.out.println(a);
	}
	
	public FinalExample() {
		name = "QA";		
	}
	
	public  static void main(String[] str) {
		System.out.println("Test");
	}

}


class A {
	
	 public final void print() {
		System.out.println("Print method of A");
	}
}

