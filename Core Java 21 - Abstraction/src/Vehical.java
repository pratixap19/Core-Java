abstract class Vehical 
{
	
	abstract void start();
}

class Car extends Vehical
{
	void start() 
	{
		System.out.println("Car starts with key");
		
	}
}

class Scooter extends Vehical
{
	void start()
	{
		System.out.println("Scooter starts with kick");
	}
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		
		
		Scooter s = new Scooter();
		s.start();

	}

}
