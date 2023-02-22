package usage2;
//To invoke current class method.
public class ClassA {
	
	public void methodA() {
		System.out.println("This is method A");
	}
	
	public void methodB() {
		this.methodA();
		System.out.println("This is method B");
	}

	public static void main(String[] args) {
		
		ClassA obj = new ClassA();
		obj.methodB();
	}

}
