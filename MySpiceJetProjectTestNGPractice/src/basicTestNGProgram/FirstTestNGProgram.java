package basicTestNGProgram;

import org.testng.annotations.Test;

public class FirstTestNGProgram {
	
	@Test(priority = 2)
	public void tc1() {
		System.out.println("My first TestNG program");
	}
	
	@Test(priority = 1)
	public void tc2() {
		System.out.println("My second TestNG program");
	}
	
	@Test(priority = 3)
	public void tc3() {
		System.out.println("My third TestNG program");
	}

}
