
public class StringMethods {

	public static void main(String[] args) {
		
		String s1 = "EEC classes";
		
		String s2 = "training";
		
		String s3 = "TRAINING";
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.startsWith("E"));
		
		System.out.println(s1.endsWith("s"));
		
		System.out.println(s1.charAt(4));
		
		System.out.println(s1.length());// it consider space.
		
		//System.out.println(s1.replace('E', 'B'));
		
		System.out.println(s1.substring(4));
		
		System.out.println(s1.substring(1,7));
		
		//System.out.println(s1.concat(s2));
		
		//System.out.println(s2.equals(s3));
		
		//System.out.println(s2.equalsIgnoreCase(s3));
		
		//System.out.println(s1.contains("cla"));
		
		//System.out.println(s1.replace('e', 'a'));
		
		//System.out.println(s1.replace("EEC", "ABC"));
		
		

	}

}
