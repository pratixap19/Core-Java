package sadikDemo;

public class Child extends Parent{
	
	int number = 200;
	
	public Child() {
		System.out.println("Child class default constructor");
	}
	
	public int setValue(int number) {
		System.out.println("Parent class variable value assigned");
		 this.number=number;
		 return number;
	}
	
	public void print() {
		super.setValue(100);
		System.out.println(super.number);
	}

}
