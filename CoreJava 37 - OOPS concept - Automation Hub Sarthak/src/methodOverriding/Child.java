package methodOverriding;

public class Child extends Parent {

	public void initialize() {
		System.out.println("This is child's initialize method");
	}

	public static void main(String[] args) {

		Child child = new Child();
		child.initialize();
		
		Parent parent = new Parent();
		parent.initialize();
	}

}
