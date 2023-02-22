package usage3;

public class ConstructorClass2 {
	
	ConstructorClass2(){
		
		System.out.println("This is default constructor");
	}

	ConstructorClass2(int a){
		this();
		System.out.println("This is parameterized constructor and the value of a is : " + a);
	}

	public static void main(String[] args) {
		
		ConstructorClass2 obj = new ConstructorClass2(5);
	}

}
