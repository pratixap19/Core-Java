// there is only one main method in java program.
public class Animal {
	
	public void run() 
	{
		System.out.println("I am running");
	}
	
	public void eat() 
	{
		System.out.println("I am eating");
	}

	public static void main(String[] args) {
		
		Animal yoshi = new Animal();
		yoshi.run();
		yoshi.eat();
		
		Birds crow = new Birds();
		crow.fly();

	}

}

class Birds{
	public void fly() {
		System.out.println("I am flying");
	}
}
