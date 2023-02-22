
final class Bike{
	void kick() {
		System.out.println("Kicking");
	}
}

 class FinalClassEx extends Bike{
	 
	 void run() {
		 System.out.println("Running");
	 }

	public static void main(String[] args) {
		FinalClassEx obj = new FinalClassEx();
		obj.run();
		obj.kick();
			
		
     
	}

}
