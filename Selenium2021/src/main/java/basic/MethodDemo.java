package basic;

public class MethodDemo {

	private int a;

	protected int sum(int a, int b) {
		return a + b;
	}

	public void print() {
		int a = this.sum(10, 30);
		System.out.println(a);
		System.out.println(this.a);
	}

	public static void main(String[] args) {

		MethodDemo obj = new MethodDemo();
		obj.a =10;
		int b = obj.sum(10, 10);
		System.out.println(b);
		System.out.println(obj.a);
		obj.print();

	}

}
