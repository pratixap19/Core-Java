//String is immutable- Once String object is created its value or state can't changed but a new object is created.
//Two ways String is created.
//1. String literal 2. new keyword
public class StringProg {

	public static void main(String[] args) {
		
		String s1 ="EEC";
		System.out.println(s1);
		
		String s2 = new String("classes");
		System.out.println(s2);
		
		s1.concat("Easy classes");
		System.out.println(s1);
		
		String s3 = s1.concat("Easy classes");
		System.out.println(s3);
		

	}

}
