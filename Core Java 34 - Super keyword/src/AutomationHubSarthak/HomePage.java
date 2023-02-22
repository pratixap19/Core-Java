package AutomationHubSarthak;

public class HomePage extends Login {
	
	String username = "Python";//instance variable of the child class
	String password = "login@1234";
	
	public void show(String username, String password) {
		
		System.out.println(username + "*************" + password);
		System.out.println(this.username + "*************" + this.password);
		System.out.println(super.username + "*************" + super.password);
	}

	public static void main(String[] args) {
		HomePage hp= new HomePage();
		hp.show("automationHubSarthak", "java@123");

	}

}
