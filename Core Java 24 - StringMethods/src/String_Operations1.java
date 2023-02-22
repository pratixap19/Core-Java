//Automation Hub Sarthak
public class String_Operations1 {

	public static void main(String[] args) {

		String s1 = "Automation Hub Sarthak";

		// 1.length() method

		System.out.println(s1.length());
		int val = s1.length();

		if (val == 0) {
			System.out.println("This is not the right string");
		} else {
			System.out.println("This is the right string");
		}

		// 2.isEmpty() method

		String s2 = "";
		boolean value = s2.isEmpty();
		System.out.println(value);

		// 3.trim() method. It removes the blank space before and after the String
		// starts and ends.

		String s3 = "  WorldCup 2011 is India's";
		String returnval = s3.trim();
		System.out.println(returnval);

		// 4.Using trim() and length() methods together

		String s4 = "  Java is an OOP language    ";
		System.out.println(s4.length());
		System.out.println(s4.trim().length());// You can't write length().trim()

		// 5. Compare two Strings using equals(), equalsIgnoreCase(), compareTo(),
		// compareToIgnoreCase()

		String s5 = "Java";
		String s6 = "Python";
		
		//equals() method //return type is boolean
		System.out.println(s5.equals(s6));
		boolean equals = s5.equals(s6);
		System.out.println(equals);
		
		//equalsIgnoreCase() method. //return type is boolean
		String s7 = "JAVA";
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s7));
		
		//compareTo(). //return type is integer
		String s8 = "I am learning Strings in Java";
		String s9 = "I am not interested in Strings in Java";
		
		int val1 = s8.compareTo(s9);
		System.out.println(val1);
		
		String s10 = "a";//unicode value of a is 97
		String s11 = "A";//unicode value of A is 65
		System.out.println(s10.compareTo(s11));//Ans is 32. 97-65=32
		
		//compareToIgnoreCase()
		String s13= "MARUTI";
		String s14 = "maruti";
		System.out.println(s13.compareToIgnoreCase(s14));
		
		//how to add or concat() strings
		String s15 = "10";
		String s16 = "Selenium";
		String s17 = "25";
		String s18 = "Java";
		
		System.out.println(s15+s16+s17+s18);
		System.out.println(s15+s17+s16+s18);
		
		System.out.println(s15.concat(s16).concat(s17).concat(s18));
		
		//how to join string
		String s19 = "Maruti";
		String s20 = "Toyota";
		String s21 = "Hyundai";
		System.out.println(String.join(".", s19,s20,s21));
		
		//subSequence()
		String s22 = "Lockdown is boring but essential";//starts from 4th position but ends with (16-1)th position
		System.out.println(s22.subSequence(4, 16));
		//System.out.println(s22.subSequence(0, 125));//StringIndexOutOfBoundsException
		
		//Substring()
		System.out.println(s22.substring(9));
		System.out.println(s22.substring(9, 18));//starts from 9th but ends with (18-1) position
		
		String s23 = "AUTOMATION";
		System.out.println(s23.toLowerCase());
		
		char c[] = s23.toCharArray();//convert String to character array
		System.out.println(c);
		
	}

}
