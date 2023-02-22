package javaInterface;

public class User implements Shopping{
	
	public static void tokenID() {
		System.out.println("User's personal tokenID");
	}

	@Override
	public void launchurl() {
		
		System.out.println("It is a method implemented from interface");
	}

	@Override
	public void login() {
		System.out.println("It is a method implemented from interface");
		
	}

	@Override
	public void landingPageValidation() {
		System.out.println("It is a method implemented from interface");
		
	}

	@Override
	public void selectItem() {
		
		System.out.println("It is a method implemented from interface");
	}

	@Override
	public void payment() {
		System.out.println("It is a method implemented from interface");
		
	}

	@Override
	public void logOut() {
		System.out.println("It is a method implemented from interface");
	}

}
