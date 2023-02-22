package usage4;
//this can be passed as an argument in the method call
public class ClassB {
	
	public void methodA(ClassB obj) {
		System.out.println("This is method");
	}
	
	public void methodCall() {
		methodA(this);
	}

	public static void main(String[] args) {
		
		ClassB obj = new ClassB();
		obj.methodCall();
	}

}
