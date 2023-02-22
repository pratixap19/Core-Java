package oops;
//Automation Hub Sarthak
public class Animal {

	public void eating() {
		System.out.println("Romeo eats");
	}
	public void barking() {
		System.out.println("Romeo barks");
	}
	public static void main(String[] args) {
		
		Animal romeo = new Animal();
		romeo.eating();
		romeo.barking();
		
		//Birds moty = new Birds();
		//moty.fly();
		//moty.speak();
		
		//Vehical vehical = new Vehical();
		//vehical.carDrive();
		//vehical.truckDrive();
		
	}
	
class Birds{
		void fly() {
			System.out.println("Moty flys");
		}
		
		void speak() {
			System.out.println("Moty speaks");
		}
}
	
class Vehical{
		
		 void truckDrive() {
			System.out.println("Truck driving");
		}
		
		 void carDrive() {
			System.out.println("Car driving");
}
		
	}
}

