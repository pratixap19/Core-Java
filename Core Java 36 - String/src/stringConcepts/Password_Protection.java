package stringConcepts;

public class Password_Protection {

	public static void main(String[] args) {
		
		String s1 = new String("Password123");// it will create 2 objects. one in heap and other in SCP
		
		char ch[] = new char[]{'P', 'a', 's', 's', 'w','o','r','d','1','2','3' };
		
		System.out.println("The password in the String object is:" + s1);
		System.out.println("The password in the char array is:" + ch);// By default char array will store data in encoded format

		//We should store password in char array then String
		//Reason 1: It is easily retrievable in terms of hacking. String are immutable. every time it will create new object. Garbage Collector will not work.
		//Reason 2: By default char array will store data in encoded format.
	}

}
