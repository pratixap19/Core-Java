
public class StringDemo {

	public static void main(String[] args) {
		
		String s1 = "Welcome to";
		String s2 = "Training";
		
		//length()-return length of the string.
		System.out.println(s1.length());
		
		//concat()-join strings.
		System.out.println(s1.concat(s2));
		
		//Equals()-compare the strings
		String s3 = "WELCOME";
		String s4 = "welcome";
		System.out.println(s3.equals(s4));//false
		System.out.println(s3.equalsIgnoreCase(s4));//true
		
		//Contains()-check string contains another string.
		System.out.println(s3.contains("wel"));//false
		System.out.println(s3.contains("WEL"));//true
		
		//Substring()-extracting substring from main string.
		//Explanation
	//    0 1 2 3 4 5 6 -----starting index
	//    W E L C O M E
	//    1 2 3 4 5 6 7 -----ending index
	//    substring(starting index, ending index)
		System.out.println(s3.substring(0,3));// WEL
		System.out.println(s3.substring(4, 7));//OME
		System.out.println(s3.substring(2, 6));//LCOM
		
		//Replace()- replacing strings/characters within a string.
		System.out.println(s4.replace("l", "e"));
		System.out.println(s4.replace("come", "kame"));

	}

}
