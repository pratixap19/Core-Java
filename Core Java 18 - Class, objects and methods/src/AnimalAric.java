//If we don't create constructor, each object initialized same value or 
//we need to write two extra lines of code as below. To avoid this we create constructor in programming.
public class AnimalAric 
 {
	
	String color = "black";
	int age = 3;
	

	public static void main(String[] args) {
		
		AnimalAric e1 = new AnimalAric();
		
		System.out.println("e1 color is" + " " + e1.color);
		System.out.println("e1 age is" + " " + e1.age);
		
		AnimalAric e2 = new AnimalAric();
		e2.color="brown";
		e2.age=5;
		
		System.out.println("e2 color is" + " " + e2.color);
		System.out.println("e2 age is" + " " + e2.age);
		
		AnimalAric e3 = new AnimalAric();
		System.out.println("e3 color is" + " " + e3.color);
		System.out.println("e3 age is" + " " + e3.age);
	
		
	}

}
