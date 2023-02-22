//Followed Automation hub Sarthak
//Methods are independent units so we can't create method inside other method.
//They have certain logics and they can execute that logic under certain condition.
//Can you create method with default access modifier? No. Default methods only be created inside an interface.

public class Methods {

	public int test() {
		System.out.println("This is my test method");

		int i = 10;
		int j = 20;
		int k = i + j;
		return k;
	}

	public boolean sample() {

		System.out.println("This is boolean return type method");
		boolean b1 = 1 < 2;
		boolean b2 = 2 < 1;
		return b2;
	}

	private void bedroom() {
		System.out.println("This is a private method");
	}

	protected void wall() {
		System.out.println("This is a protected method");
	}

	public static void main(String[] args) {

		System.out.println("This is main method");

		Methods obj = new Methods();
		int l = obj.test();
		System.out.println(l);
		

		boolean b = obj.sample();
		System.out.println(b);
		
		obj.wall();
		obj.bedroom();

	}

}
