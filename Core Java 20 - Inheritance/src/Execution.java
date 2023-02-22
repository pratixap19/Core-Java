//Automation Hub Sarthak
public class Execution {

	public static void main(String[] args) {
		Child child = new Child();//Compile Time Polymorphism
		child.car();
		child.bike();
		child.money();
		child.house();
		child.land();
		
		System.out.println("*****************************************");
		Parent parent = new Parent();//Compile Time Polymorphism
		parent.money();
		parent.land();
		parent.house();
		
		System.out.println("*****************************************");
		//Top Casting
		Parent parent1 = new Child();// This concept is known as Dynamic Plymorphism.
		                             // Parent class object reference is pointing to child class object.
		parent1.money();

		//Down casting
		Child child1 = (Child) new Parent();// Down casting is not a good practice. we get Class cast exception
	}

}
