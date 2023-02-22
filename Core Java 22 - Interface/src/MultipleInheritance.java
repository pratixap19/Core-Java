
interface A{
	
	int a =10;
	void display(); 
}

interface B{
	int b = 20;
	void show();
}

public class MultipleInheritance implements A, B {
	
	public void display() {
		System.out.println(a);
	}
	
	public void show() {
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		MultipleInheritance ie = new MultipleInheritance();
		ie.display();
		ie.show();
	}

}
