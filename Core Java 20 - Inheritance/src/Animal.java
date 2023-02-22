
class Animal {
	
	void eat() {
		System.out.println("I am eating");
	}

}

class Cat extends Animal
{
	public static void main(String[] args)
	{
		Cat d = new Cat();
		d.eat();
	}
	
}


