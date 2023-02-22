
public class Test {
	// In c and C++ languages call by value and call by reference is there but in 
	//Java only call by value is there.
	
	void disp(int a, int b) {
		//int x=a;
		//int y=b;
		int z=a+b;
		System.out.println(z);
		System.out.println("Geeky Shows");
		
	}

	public static void main(String[] args) {
		
		Test t = new Test();
		t.disp(10, 20);//calling instance method and passing value
		
	}

}
