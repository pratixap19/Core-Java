package javaInterface;
//Automation Hub Sarthak
public interface Shopping {
	int i=10;
	String s = "Java";
	public void launchurl();
	public void login();
	public void landingPageValidation();
	public void selectItem();
	public void payment();
	public void logOut();
	//In interface can I make a static method abstract? No. You have to add the body to a static method in an interface.
	public static void tokenValidation() {
		System.out.println("This is static method inside interfacr");
	}
	
	public static void main(String[] args) {
		System.out.println("This is main method inside an interface");
		tokenValidation();
	}

}
