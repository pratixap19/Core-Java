package abstraction;

public class Gen_New extends Generator{
	
	@Override
	public void startmechanism() {
		System.out.println("New generator will start with ignition button");
		
	}
	

	public static void main(String[] args) {
		Gen_New gn = new Gen_New();
		gn.startmechanism();
		
		Gen_Old gn1 = new Gen_Old();
		gn1.startmechanism();
		
		System.out.println(gn.primaryfuel = "Diesel");
		System.out.println(gn.secondaryfuel = "kerosine");
		
		System.out.println(gn1.primaryfuel = "Regular");
		System.out.println(gn1.secondaryfuel = "Premium");
		
		gn.serviceTime();
		
	}

	

}
