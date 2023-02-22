package overriding;

public class ClassC extends ClassP{

	public void add(int a, int b) {

		int c = a + b;
		System.out.println("Child class method" + " " + c);
	}

	public void classCMethod() {

		System.out.println("Child class method call");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
