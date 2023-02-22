package javaInterface;

public class Test {

	public static void main(String[] args) {
		User user = new User();
		user.launchurl();
		user.login();
		user.selectItem();
		user.payment();
		user.logOut();
		
		Shopping shopping = new User();//Top casting
		Shopping.tokenValidation();//In case you want to call the static method of an interface, call it 
		//directly via the interface name.
		
		System.out.println(Shopping.i);
		System.out.println(Shopping.s);
		
		shopping.launchurl();
		shopping.login();
		shopping.selectItem();
		shopping.payment();
		shopping.logOut();
		
	}

}
