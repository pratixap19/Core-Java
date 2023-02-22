
public class ExternalClass  {
	

	public static void main(String[] args) {
        
		//Call external methods from external class
		UserDefinedMethods obj = new UserDefinedMethods();

		obj.helloWorld();// method call using object

		UserDefinedMethods.m1();

		int x = obj.square(8);
		System.out.println(x);

		obj.sayHi("Pratixa");

	}

}
