
public class Test {

	int a = 10;
	static int b = 20;
	
	
	public static void main(String[] args) {
		
		Test t1 = new Test();
		
		System.out.println(t1.a);
		System.out.println(t1.b);//we can write either Test.b, t1.b or only b
		
		t1.a=1000;
		t1.b=2000;
		
		System.out.println(t1.a);
		System.out.println(t1.b);
		
		Test t2 = new Test();
		
		System.out.println(t2.a);
		System.out.println(t2.b);
		
	}

}
