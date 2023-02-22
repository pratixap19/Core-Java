package usage3;

public class ConstructorClass1 {
	
	ConstructorClass1(){
		this(4);
		System.out.println("This is default constructor");
	}

	ConstructorClass1(int a){
		System.out.println("This is parameterized constructor and the value of a is : " + a);
	}

	public static void main(String[] args) {
		
		ConstructorClass1 obj = new ConstructorClass1();
	}

}
