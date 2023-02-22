package inheritance;

public class Child extends Parent {
	
	public void newBike() {
		System.out.println("Child's bike");
	}
	
	/*
	 * public void money() { System.out.println("Child's money"); }
	 */

	public static void main(String[] args) {
		Child child = new Child();
		child.money();
		child.land();
		child.bunglow();
		child.farmhouse();
		child.farmLands();
		//child.tigori(); Parent's private method can't be inheritate by child class.
		
		Parent parent = new Parent();
		parent.land();
		parent.bunglow();
		parent.money();
		
		GrandParent gp = new GrandParent();
		gp.farmLands();
		gp.farmhouse();
		//gp.money;//GrandParent can't inheritate parent's property

	}

}
