//Automation Hub Sarthak
public class String_Operation2 {

	public static void main(String[] args) {
		//replace()
		String s = "I am learning Strings";
		System.out.println(s.replace("am", "am not"));
		
		String s1 = "Can an ankle injury heal";
		System.out.println(s1.replace("an", "add"));
		
		//replaceFirst()
		System.out.println(s1.replaceFirst("an", "add"));
		
		//replaceAll()
		System.out.println(s1.replaceAll("an(.)", "add"));//replace() method can't work 
		//with regular expression where as replaceAll() can work with regex.
		
		System.out.println("***************************************");
		
		String s2 = "Selenium";
		System.out.println(s2.indexOf(7));//(indexOf(m)) - correct. indexOf(7) - wrong. You can use only 
		//character not integer.
		
		System.out.println(s2.indexOf("m"));
		
		//lastIndexOf()
		System.out.println(s2.lastIndexOf("m"));//Ans:7
		System.out.println(s2.lastIndexOf("ele"));// Ans:1
		
		//charAt()
		System.out.println(s2.charAt(7));//Ans:m
		
		//contains() method
		System.out.println(s2.contains("S"));
		System.out.println(s2.contains("Se"));
		System.out.println(s2.endsWith("s"));
		System.out.println(s2.endsWith("e//Automation Hub Sarthakm"));
		System.out.println(s2.startsWith("S"));
	}
	}
	


