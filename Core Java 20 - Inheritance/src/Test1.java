

class A {
	int a;
	int b;

	public void display() {
		System.out.println(a + b);
	}
}

class B extends A{
	int x;
	int y;

	public void show() {
		System.out.println(x + y);
	}
}

	public class Test1 {

	public static void main(String[] args) {
       /*A obj1 = new A();
       obj1.a=100;
       obj1.b=200;
       obj1.display();*/
       
       B obj2=new B();
       obj2.x=10;
       obj2.y=20;
       obj2.a=30;
       obj2.b=40;
       obj2.display();
       obj2.show();
	}
	
}