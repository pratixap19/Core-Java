
public class FinalVariableExample {
	
	final int a=10;
	void m1() {
		a=20;
	}
	
	public static void main(String[] args) {
		
      FinalVariableExample obj = new FinalVariableExample();
      obj.m1();
	}

}
