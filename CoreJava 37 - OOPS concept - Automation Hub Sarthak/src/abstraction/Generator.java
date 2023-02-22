package abstraction;

public abstract class Generator {
	
	String primaryfuel;
	String secondaryfuel;
	
	public abstract void startmechanism();
	
	public void serviceTime() {
		System.out.println("Service time is 10 sec");
	}

}
